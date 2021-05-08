package concrete;

import java.util.Date;

import Abstract.OrderService;


public class OrderManager implements OrderService {

	@Override
	public void add(int playerId, int gameId, Date date, double price, int campaignId) {
		System.out.println("sipari� tamamland�.");
		
	}

	@Override
	public void update(int playerId, int gameId, Date date, double price, int campaignId) {
		System.out.println("sipari� g�ncellendi. ");
		
	}

	@Override
	public void delete(int orderId) {
		System.out.println("sipari� silindi. ");
		
		
	}

}
