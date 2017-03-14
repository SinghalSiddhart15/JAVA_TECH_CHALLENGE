package com.siddhart.utils;

import org.codehaus.jackson.map.ObjectMapper;

import com.siddhart.bean.Parent;

public class JsonMap {
	
	public Parent jsonmap(String str)
	{
		ObjectMapper om = new ObjectMapper();
		Parent p = new Parent();
		
		try
		{
			p=om.readValue(str,Parent.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return p;
		
		
	}

}
