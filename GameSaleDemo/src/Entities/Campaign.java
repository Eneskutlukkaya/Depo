package Entities;

import java.util.Date;

public class Campaign {
	private int Id;
	private String name;
	private Date startDate;
	private Date endDate;
	private double discountPercent;
	public Campaign(int id, String name, Date date, Date endDate, double discountPercent) {
		this.Id = id;
		this.name = name;
		this.startDate = date;
		this.endDate = endDate;
		this.discountPercent = discountPercent;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	

}
