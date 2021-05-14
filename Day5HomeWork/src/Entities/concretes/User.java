package Entities.concretes;

import Entities.abstracts.Entity;

public class User implements Entity {
	private int Id;
	private String firstName;
	private String lastName;
	private String Email;
	private String Password;
	public User(int id, String firstName, String lastName, String email, String password) {
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Email = email;
		Password = password;
	}
	public User() {
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
