import Business.concretes.UserManager;
import Core.concretes.GoogleAccountManager;
import DataAccess.abstracts.UserDao;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 =new User (1,"ENES", "kutlukaya","enes@hotmail.com","987654");
		User user2 = new User (2,"Diego","Maradona ","THEGods_hand@hotmail.om", "4556662525");
		User user3 =new User (3,"engin","demirog" , "engindemirog@hotmail.com","99852135");
		
		UserManager userManager = new UserManager(new HibernateUserDao(),new GoogleAccountManager());
		 userManager.signUp(user1);
		 userManager.signUp(user2);
		 userManager.signUp(user3);
		 userManager.signIn("enes@hotmail.com","987654");
		 userManager.signIn("engindemirog@hotmail.com","99852135" );
		
		
		
		
		
		
	}   


}
