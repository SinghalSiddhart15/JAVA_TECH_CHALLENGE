package com.avengers.dao;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class DBConnection {

	
	final static  String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final static String DB_URL="jdbc:mysql://localhost:3306/Siddhart_TechChallenge";
	final static String DB_HOST="root";
	final static String DB_PASSWORD="password";
	
	public DBConnection()
	{}

	public static Connection getConnection() throws Exception {

			        Class.forName(JDBC_DRIVER);
			
			        Connection conn=null;
			
			        conn= (Connection) DriverManager.getConnection(DB_URL,DB_HOST,DB_PASSWORD);
			
			        return conn;
	}
}

