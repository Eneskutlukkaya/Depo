package concrete;



import Abstract.UserService;

public class PlayerManager implements  UserService  {

	@Override
	public void add() {
		System.out.println("Oyuncu  eklendi");
	}

	@Override
	public void delete() {
		System.out.println("Oyuncu  silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Oyuncu  güncellendi");
		
	}

	
	
	

}
