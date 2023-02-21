package it.betacom.bravo;

public class User {
	private String username;
	private String role;
	
	public User(String username, String role) {
		this.username = username;
		this.role = role;
	}
	
	@Override
	public String toString() {
		String s = "Username: " + getUsername() + " | Role: " + getRole();
		return s;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
