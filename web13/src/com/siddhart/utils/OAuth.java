package com.siddhart.utils;

	import java.io.*;

	import oauth.signpost.basic.DefaultOAuthConsumer;
	import java.net.*;

import org.codehaus.jackson.map.ObjectMapper;

import com.siddhart.bean.*;

	public class OAuth {
	    
	    public static Parent Sign(String myurl) {
	        
	    	String str= "";
	    	Parent p = null;
	    	try {
	            
	        	DefaultOAuthConsumer e = new DefaultOAuthConsumer("avengers-152759", "gIrbIo1nltHYOlcf");
	            
	            URL url = new URL(myurl);
	            
	           
	            HttpURLConnection request = (HttpURLConnection)url.openConnection();
	            
	            request.setRequestProperty("Accept", "application/json");
	            
	            e.sign(request);
	            
	            System.out.println(".....Sending GET request to URL.... : " +myurl);
	            BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
	            String line="";
	            
	           
	            
	            while((line = in.readLine())!=null)
	            {
	            	System.out.println(line);
	            	str= str+line;
	            }
	            
	        
	            System.out.println("str is "+str);
	            ObjectMapper om = new ObjectMapper();
	           p = om.readValue(str, Parent.class);
	            
	            Marketplace mp = p.getMarketplace();
	            
	            System.out.println(mp.getBaseUrl());
	            return new JsonMap().jsonmap(str);
	        }
	        catch (Exception e) {
	         e.printStackTrace();
	        }       
	        return new JsonMap().jsonmap(str);
	    	
	    }
	}
	

