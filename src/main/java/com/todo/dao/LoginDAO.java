package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.todo.model.Login;
import com.todo.utils.JDBCUtils;

public class LoginDAO {
	
        public static boolean validate(Login user)
        {
        	boolean status=false;
        	String SELECT_QUERY="select * from users where username=? and password=?";
        	Connection connection = JDBCUtils.getConnection();
        	PreparedStatement pstmt;
			try {
				pstmt = connection.prepareStatement(SELECT_QUERY);
				pstmt.setString(1, user.getUsername());
	        	pstmt.setString(2, user.getPassword());
	        	ResultSet res = pstmt.executeQuery();
	        	status=res.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return status;
        }
      
}
