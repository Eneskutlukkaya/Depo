package concrete;

import Abstract.GameService;

public class GameManager implements GameService {

	@Override
	public void add() {
		System.out.println("Oyun eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Oyun silindi");
	}

	@Override
	public void update() {
		System.out.println("Oyun güncellendi");
		
	}

}
