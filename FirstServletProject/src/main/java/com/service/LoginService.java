package com.service;

import com.dao.UserRepo;

public class LoginService {
	
	public boolean validateUser(String uname, String pass) {
		if(UserRepo.getUsers().containsKey(uname)) {
			if(UserRepo.getUsers().get(uname).equals(pass)) 
				return true;
			else
				return false;
		}
		else {
			return false;
		}
	}

}
