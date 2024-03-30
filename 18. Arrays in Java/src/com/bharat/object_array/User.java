package com.bharat.object_array;

public class User {
	private String userName;
	private String userEmail;
	
	public User(String userName, String userEmail) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return userName + "  " + userEmail;
	}
}
