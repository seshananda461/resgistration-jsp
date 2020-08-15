package com.trendtech.registration.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection()  {
		
		Connection conn = null;
	
		try {
		Class.forName("org.postgresql.Driver"); 

			String dbUrl= "jdbc:postgresql://postgresql.crgxxlxz0auv.ap-south-1.rds.amazonaws.com:5432/postgresql";
			 conn =DriverManager.getConnection( dbUrl,"postgresql","postgresql");
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
//		finally{
//			try {
//				conn.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
	
//		}
		
		return conn;
		
	}

}
