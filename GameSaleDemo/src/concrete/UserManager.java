package concrete;

import Abstract.UserService;

public class UserManager implements UserService {

	@Override
	public void add() {
		System.out.println("Kullanıcı  eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Kullanıcı  silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Kullanıcı  güncellendi");
		
	}

}
