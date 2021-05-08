package Entities;

import java.util.Date;

public class Order {
	private int Id;
	private Date date;
	private int playerId;
	private int campaignId;
	private int gameId;
	private double price;
	private double discountPercent;
	public Order(int id, Date date, int playerId, int campaignId, int gameId, double price, double discountPercent) {
		Id = id;
		this.date = date;
		this.playerId = playerId;
		this.campaignId = campaignId;
		this.gameId = gameId;
		this.price = price;
		this.discountPercent = discountPercent;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
	
	

}
