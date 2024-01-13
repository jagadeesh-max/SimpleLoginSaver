package com.example.SimpleLoginSaver.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDatabase {
	
	@Id
	String Username;
	String Email;
	String Password;
	public UserDatabase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDatabase(String username, String email, String password) {
		super();
		Username = username;
		Email = email;
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
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
	@Override
	public String toString() {
		return "UserDatabase [Username=" + Username + ", Email=" + Email + ", Password=" + Password + "]";
	}
	
	

}
