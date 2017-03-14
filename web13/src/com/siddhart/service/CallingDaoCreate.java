package com.siddhart.service;

import com.avengers.dao.CreateTable;
import com.avengers.dao.InsertIntoTables;
import com.siddhart.domain.UserDetails;

public class CallingDaoCreate {

	
		public static void CallCreate()
		{
			CreateTable.CreateTableCreator();
			CreateTable.CreateTableCompany();
			CreateTable.CreateTableOrder();
			CreateTable.CreateTableAccount();
		}
		
		public static void CallInsert(UserDetails ud)
		{
			
			InsertIntoTables.InsertCreator(ud);
		}
		
		

}

