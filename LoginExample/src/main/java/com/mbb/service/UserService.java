package com.mbb.service;

import java.util.List;

import com.mbb.dao.UserDao;
import com.mbb.dto.User;

public class UserService {
	
	private UserDao uDao =new UserDao();
	public String addUser(User user) {
		if(user==null || user.getName().length()<4 || user.getPassword().length()<8)
			return "Invalid User Data";
		else {
			String random=""+Math.random();
			String uid=user.getName().substring(0,2)+random.substring(2,5);
			user.setUid(uid);
			return uDao.createUser(user);
		}
		
	}
	public User checkLogin(User user) {
		if(user.getUid().length()<4 ||user.getPassword().length()<6 )
			return null;
		else
			return uDao.validateUser(user);
	}
	public List<User> getAll() {
		return uDao.getAllUser();
	}
}
