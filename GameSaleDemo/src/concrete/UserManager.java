package concrete;

import Abstract.UserService;

public class UserManager implements UserService {

	@Override
	public void add() {
		System.out.println("Kullan�c�  eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Kullan�c�  silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Kullan�c�  g�ncellendi");
		
	}

}
