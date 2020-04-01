/**
 * 
 */
package com.example.junit.junit.entity;

/**
 * @author ErwinDeLeon
 *
 */
public class Usuario {

	private String user;
	private String password;
	
	public Usuario(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}