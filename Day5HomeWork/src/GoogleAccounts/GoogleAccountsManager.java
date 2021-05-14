package GoogleAccounts;

import Entities.concretes.User;

public class GoogleAccountsManager {
	public void singIn(String email,String password){
		if (email=="deneme123@hotmail.com" && password=="123456") 
		{
			System.out.println("Login with google account is succesful");
			
		}
		else 
		{
			System.out.println("Failed to login");
		}
	}
	
	
	
	
 public void signUp(User user) 
 {
	 
	 
	 
 }

}    
