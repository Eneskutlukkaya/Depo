import java.util.GregorianCalendar;

import Abstract.CampaignService;
import Abstract.CategoryService;
import Abstract.GameService;
import Abstract.OrderService;
import Abstract.PlayerService;
import Abstract.UserService;
import Entities.Campaign;
import Entities.Category;
import Entities.Game;
import Entities.Order;
import Entities.Player;
import concrete.CampaignManager;
import concrete.CategoryManager;
import concrete.GameManager;
import concrete.OrderManager;
import concrete.PlayerManager;

public class Main {

	public static void main(String[] args) {
		CampaignService campaignService= new CampaignManager();
		Campaign campaign1 = new Campaign(1, "Bahar kampanyasý",
				new GregorianCalendar(2021,05,8).getTime(),new GregorianCalendar(2021,06,8).getTime() , 15);
		campaignService.add();

		UserService playerService= new PlayerManager();
		Player player1= new Player(1, "ENES", "KUTLUKKAYA", "000001",
				new GregorianCalendar(1998,04,2).getTime());
		playerService.add();
		
		CategoryService categoryService = new CategoryManager();
		Category category1 =new Category(1, "Savaþ oyunlarý");
		categoryService.add();
		
		GameService gameService= new GameManager();
		Game game1 =new Game(1, "Call Of Duty","kýsa süreliðine",199,"1");
		gameService.add();
		
		OrderService orderService= new OrderManager();
		Order order1 = new Order(1, new GregorianCalendar(2021,05,8).getTime(),1,199,1, 15, 0);
		orderService.add(1, 1, new GregorianCalendar(2021,05,8).getTime(), 199,15);


	}

}
