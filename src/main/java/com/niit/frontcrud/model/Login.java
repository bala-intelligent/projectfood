package com.niit.frontcrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="login")
public class Login {
	@javax.persistence.Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
private int userid;
	@NotNull
	@Size(min=2,max=30)
	private String username;
	@NotNull
	@Size(min=2,max=10)
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	


}
