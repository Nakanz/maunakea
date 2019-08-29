package com.maunaawareness.maunaserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PASSWORD")
public class PasswordEnt {
	@Id
	@GeneratedValue
	@Column(name = "PASSWORD_ID")
	private int passwordId;
	
	@Column(name = "USER_PW_ID")
	private int userPwId;
	
	@Column(name = "PASSWORD")
	private String password;
	
	public PasswordEnt() {}
	
	public PasswordEnt(int userPwId, String password) {
		this.userPwId = userPwId;
		this.password = password;
	}

	public int getPasswordId() {
		return passwordId;
	}

	public int getUserPwId() {
		return userPwId;
	}

	public void setUserPwId(int userPwId) {
		this.userPwId = userPwId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
