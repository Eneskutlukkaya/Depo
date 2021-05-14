package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class HibernateUserDao implements UserDao {
	private List<User> users;
	
	public HibernateUserDao() {
		users= new ArrayList<User>();
	}
    public List<User>gettlist(){
    	return this.users;
    }

	@Override
	public void saveToSystem(User user) {
		System.out.println("Kullanýcý Database eklendi :"+user.getFirstName());
		
	}

	@Override
	public List<User> gettall() {
		return users;
	}

}
