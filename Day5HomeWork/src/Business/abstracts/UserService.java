package Business.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserService {
	boolean signUp (User user);
	void signIn(String email,String password);
	void signUpWithGoogle(User user);
	void signInWithGoogle(String email,String password);
	public boolean validateUser(User user);
	public boolean isEmailUsed(String Email);
	public boolean isEmailValid(String Email);
	public boolean isFirstOrLastnameValid(User user);
	public boolean sendVerificationMail(User user);
	public boolean ClickVerificationLink();
	List<User>gettAll();

}
