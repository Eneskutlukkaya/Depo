package concrete;

import Abstract.UserService;

public class UserManager implements UserService {

	@Override
	public void add() {
		System.out.println("Kullanýcý  eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Kullanýcý  silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Kullanýcý  güncellendi");
		
	}

}
