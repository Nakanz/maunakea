package com.maunaawareness.maunaserver.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class UserEnt {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "LASTNAME")
	private String lastname;
	
	@Column(name = "FIRSTNAME")
	private String firstname;
	
	@Column(name = "DATE_JOINED")
	private Date dateJoined;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "EMAIL")
	private String email;
	
	public UserEnt() {}
	
	public UserEnt(String lastname, String firstname, String username, String email) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.username = username;
		this.dateJoined = new Date();
		this.email = email;
	}

	public int getUserId() {
		return userId;
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
