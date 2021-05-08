package Entities;

import java.util.Date;

public class Player extends User {
	private String firstname;
	private String lastname;
	private String identitynumber;
	private Date birthdate;

	public Player(int id, String firstname, String lastname, String identitynumber, Date birthdate) {
		super(id);
		this.firstname = firstname;
		this.lastname = lastname;
		this.identitynumber = identitynumber;
		this.birthdate = birthdate;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getIdentitynumber() {
		return identitynumber;
	}

	public void setIdentitynumber(String identitynumber) {
		this.identitynumber = identitynumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	
	}

 
