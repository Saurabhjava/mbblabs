package com.dao;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
	private static Map<String,String> users;
	
	static {
		users=new HashMap<String ,String>();
		users.put("Saurabh", "abc123");
		users.put("Ankit", "xyz123");
		users.put("Ayush", "aa123");
	}
	
	public static Map getUsers() {
		return users;
	}
}
