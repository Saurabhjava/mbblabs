package com.mbb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mbb.config.MyDbConnection;
import com.mbb.dto.User;

public class UserDao {
	private Connection con=MyDbConnection.getDbConnection();
	
	public String createUser(User u) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?)");
			ps.setString(1, u.getUid());
			ps.setString(2, u.getName());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getEmail());
			ps.setString(5, "user");
			int row=ps.executeUpdate();
			if(row>0)
				return "User Created "+u.getUid();
			else
				return "User Not created";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "User Not created";
		}
	}
	public User validateUser(User user) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from Users where userid=? and password=?");
			ps.setString(1, user.getUid());
			ps.setString(2, user.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				User u=new User(rs.getString("name"), rs.getString("password"),rs.getString("email"));
				u.setRole(rs.getString("role"));
				return u;
			}
			else {
				return null;
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public List<User> getAllUser(){
		List<User> li=new ArrayList<User>();
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from users");
			while(rs.next()) {
				User u=new User(rs.getString(2), rs.getString(3), rs.getString(4));
				u.setUid(rs.getString(1));
				u.setRole(rs.getString(5));
				li.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
}
















