package com.avengers.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CreateTable {
	
	public static  void  CreateTableCreator()
	{
		try
		{
			Connection con= (Connection)DBConnection.getConnection();
		
			String sql= "CREATE TABLE Creator(First_Name varchar(225) ,Last_Name varchar(200),Address varchar(200),Emailid varchar(200),AccoountIdentifier varchar(200) PRIMARY KEY not null,Userid varchar(200),lang varchar(200))";
		    PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(sql);
		   	
		    prpstmt.execute();
				   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void CreateTableCompany()
	{
		try
		{
			
		Connection con= (Connection)DBConnection.getConnection();
		String sql= "CREATE TABLE Company(CompanyName varchar(225) ,ComapnyEmail varchar(200),PhoneNumber varchar(200),Emailid varchar(200),AccoountIdentifier varchar(200) PRIMARY KEY not null,Userid varchar(200),Website varchar(200),Country varchar(200))";
		PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(sql);
	   	
	    prpstmt.execute();
		   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void CreateTableOrder()
	{
		try
		{
			Connection con= (Connection)DBConnection.getConnection();
			
		    String sql= "CREATE TABLE OrderProduct(EditionCode varchar(225) ,PricingDuration varchar(200),AccoountIdentifier varchar(200) PRIMARY KEY not null)";
		
			
		    PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(sql);
		   	
		    prpstmt.execute();
		   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void CreateTableAccount()
	{
		try
		{
			Connection con= (Connection)DBConnection.getConnection();
			
		    String sql= "CREATE TABLE Account(AccoountIdentifier varchar(200) PRIMARY KEY not null)";
		
			
		    PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(sql);
		   	
		    prpstmt.execute();
				   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
