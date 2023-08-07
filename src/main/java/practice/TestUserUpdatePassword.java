package practice;

import java.sql.Connection;
import java.sql.PreparedStatement;

import day11.solved.ConnectionUtil;


public class TestUserUpdatePassword {
		 
	    public static void main(String[] args) throws Exception {
	 
	        Connection connection = ConnectionUtil.getConnection();
	 
	        String userName = "<username>";
	        String password = "<password>";
	        
	       
	        String query = "UPDATE users SET password=? WHERE user_name=?";
	 
	        PreparedStatement pst = connection.prepareStatement(query);
	        pst.setString(1, password);
	        pst.setString(2, userName);
	 
	        int rows = pst.executeUpdate();
	        System.out.println("No of rows updated" + rows);
	    }
	 
	
}