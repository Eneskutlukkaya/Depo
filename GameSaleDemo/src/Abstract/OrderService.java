package Abstract;

import java.util.Date;

import Entities.Order;

public interface OrderService {
	void add(int playerId,int gameId,Date date,double price,int campaignId);
	void update(int playerId,int gameId,Date date,double price,int campaignId);
	void delete(int orderId);
	

}
