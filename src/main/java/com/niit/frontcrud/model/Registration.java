package com.niit.frontcrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
@Table(name="registration")
@Component
public class Registration
{
	
	@NotNull
	@Size(min=2,max=30)
	@Id
	private String username;
	@NotNull
	private String email;
	@NotNull
	@Size(min=10,max=12)
	private long phonenumber;
	@NotNull
	@Size(min=4,max=8)
	private String password;
	@NotNull
	@Size(min=10,max=8)
	private String confirmpassword;
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
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
}
