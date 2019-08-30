package com.maunaawareness.maunaserver.web.vo;

import java.util.Date;

public class User {
	private String lastname;
	private String firstname;
	private Date dateJoined;
	private String username;
	private String email;
	
	public User() {
		
	}
	
	public User(String lastname, String firstname, Date dateJoined, String username, String email) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.dateJoined = dateJoined;
		this.username = username;
		this.email = email;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
