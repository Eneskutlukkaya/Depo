package Entities;

public class Game {
	int Id;
	String Name;
	String Description;
	double Price;
	String CategoryId;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(String categoryId) {
		CategoryId = categoryId;
	}
	public Game(int id, String name, String description, double price, String categoryId) {
		Id = id;
		Name = name;
		Description = description;
		Price = price;
		CategoryId = categoryId;
	}
	
	
	

}
