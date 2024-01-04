package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.todo.model.User;
import com.todo.utils.JDBCUtils;

public class UserDAO {
	
	 
	public static  int  registerEmployee(User user)
	{ 
		int result=0;
		String INSERT_QUERY="insert into users(firstname,lastname,username,password) values(?,?,?,?)";
		
		Connection connection = JDBCUtils.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement(INSERT_QUERY);
			pstmt.setString(1,user.getFirstname());
			pstmt.setString(2,user.getLastname());
			pstmt.setString(3,user.getUsername());
			pstmt.setString(4,user.getPassword());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
