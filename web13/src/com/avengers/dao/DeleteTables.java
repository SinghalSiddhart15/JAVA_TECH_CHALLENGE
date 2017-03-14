package com.avengers.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.siddhart.domain.UserDetails;

public class DeleteTables {

	public static void delete(UserDetails ud)
	{
	
		try
		{
			Connection con = (Connection)DBConnection.getConnection();
			String query = "Delete from Creator where AccoountIdentifier=?";
		    PreparedStatement prpstmt= (PreparedStatement) con.prepareStatement(query);
		    prpstmt.setString(1, ud.getAccountIdentifier());
		    prpstmt.execute();
		    String query1 = "Delete from Company where AccoountIdentifier=?";
		    PreparedStatement prpstmt1= (PreparedStatement) con.prepareStatement(query1);
		    prpstmt1.setString(1, ud.getAccountIdentifier());
		    
		    prpstmt1.execute();
		    
		    String query2 = "Delete from OrderProduct where AccoountIdentifier=?";
		    PreparedStatement prpstmt2= (PreparedStatement) con.prepareStatement(query2);
		    prpstmt2.setString(1, ud.getAccountIdentifier());
    
		    prpstmt2.execute();
		    
		    String query3 = "Delete from Account where AccoountIdentifier=?";
		    PreparedStatement prpstmt3= (PreparedStatement) con.prepareStatement(query3);
		    prpstmt3.setString(1, ud.getAccountIdentifier());
		    
		    prpstmt3.execute();

		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
