package Business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import Business.abstracts.UserService;
import Core.abstracts.AccountService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private AccountService accountService;
	
	private static final String EMAÝL_PATTERN ="^[A-Z0-9._%+-]+.(com|org|edu|net|gov|info)(.[A-Z{2})$?";
 public UserManager(UserDao userDao,AccountService accountService)
 {
	 this.userDao= userDao;
	 this.accountService= accountService;

 }
 public UserDao getUserDao() 
 {
	 return userDao;
 }
	@Override
	public boolean signUp(User user) {
		if(sendVerificationMail(user) && ClickVerificationLink()) 
		{
			System.out.println("User has succesfully registered. welcome"+user.getFirstName()
			+" "+user.getLastName());
			return true;
		}
		
    	return false;
	}

	@Override
	public void signIn(String email, String password) {
		for(User user : userDao.gettall() ) 
		{
			if(email==user.getEmail() && password==user.getPassword()) 
			{
				System.out.println(user.getFirstName()+" "+user.getLastName()+"Welcome");
				return;
			}
			System.out.println("Email or password is invalid");
		}
		
	}

	@Override
	public void signUpWithGoogle(User user) 
	    {
		     signUp(user);
		}
			

	@Override
	public void signInWithGoogle(String email, String password) 
	{
		for(User user : userDao.gettall()) 
		{
			if(user.getEmail()==email) 
			{
			   this.accountService.singIn(email, password);
			   return;
			}
			System.out.println("Aren't you member please sign up ");
			
		}
		
		
	}

	@Override
	public boolean validateUser(User user)
	{
		if(! isFirstOrLastnameValid(user)) 
		{
			return false;
		}
	   if(user.getPassword().length() <6) 
	   {
		System.out.println("******Password must be at least 6 characters****** ");   
	   }
	   if(!isEmailValid(user.getEmail())) 
	   {
		   System.out.println("Email format is in invalid ."+
	   "make sure it has the extension below.\r \n"+"org,net,gov,com,edu");
	   }
	   if(isEmailUsed(user.getEmail())) 
	   {
		   System.out.println("*****Email has already received***** ");
	   }
	   return true;
	}

	@Override
	public boolean isEmailUsed(String Email)
	{
	  for(User user :userDao.gettall()) 
	  {
		  if(user.getEmail()==Email);
		  return true;
	  }
	     return false;
	}

	@Override
	public boolean isEmailValid(String Email) {
		Pattern pattern= Pattern.compile(EMAÝL_PATTERN,Pattern.CASE_INSENSITIVE);
		return pattern.matcher(Email).find();
	}

	@Override
	public boolean isFirstOrLastnameValid(User user) {
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) 
		{
			System.out.println("******Name and Surname must contain at least 2 characters******");
			return false;
		}
		return true;
	}

	@Override
	public boolean sendVerificationMail(User user) {
		if (validateUser(user)) {
			System.out.println("Verification link of  your membership has been sent"+
		"If you  click the click , your membership will be approved.  ");
			return true;
			
		}
		return false;
	}

	@Override
	public boolean ClickVerificationLink() {
		System.out.println("You membership has been approved. ");
		return true;
		
	}

	@Override
	public List<User> gettAll() {
		return userDao.gettall();
	
	}

}
