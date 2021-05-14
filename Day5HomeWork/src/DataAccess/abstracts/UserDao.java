package DataAccess.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserDao {
	void saveToSystem(User user);
	
	List<User> gettall();

}
