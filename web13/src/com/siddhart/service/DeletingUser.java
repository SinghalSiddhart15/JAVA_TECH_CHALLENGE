package com.siddhart.service;

import com.avengers.dao.DeleteTables;
import com.siddhart.domain.UserDetails;

public class DeletingUser {

	public static void delete(UserDetails ud)
	{
		DeleteTables.delete(ud);
	}
}
