/*package ravi.web;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;

import com.siddhart.bean.Marketplace;
import com.siddhart.bean.Parent;
import com.sun.javafx.collections.MappingChange.Map;
import com.sun.xml.internal.bind.api.TypeReference;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.ResponseSuccess;

/**
 * Servlet implementation class DemoServlet
 */
/*@WebServlet("/UpdateSubscription")
public class UpdateSubscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("application/json");
	
	PrintWriter out= response.getWriter();
	String eventUrl= (String) request.getParameter("eventUrl");

	System.out.println(eventUrl);
	
	ObjectMapper mapper= new ObjectMapper();
	
	ResponseSuccess responseObject = new ResponseSuccess(true,"new-account-modifier");

	
	String json= mapper.writeValueAsString(responseObject);
	
	out.print(json);

	OAuthConsumer consumer = new DefaultOAuthConsumer("avengers-152759", "gIrbIo1nltHYOlcf");
	URL url = new URL(eventUrl);
	HttpURLConnection requestres = (HttpURLConnection) url.openConnection();
	requestres.setRequestProperty("Accept", "application/json");
	try
	{
	consumer.sign(requestres);

	
	requestres.connect();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	BufferedReader f= new BufferedReader(new InputStreamReader(requestres.getInputStream()));
	String l = "";
	String str = "";
	while((l = f.readLine())!=null)
	{
		//System.out.println(l);
		str = str + l;
	}
	System.out.println(str);

		ObjectMapper om = new ObjectMapper();
		Parent p = om.readValue(str,Parent.class);
		
		System.out.println("*********");
		//System.out.println(p);
		
		Marketplace mp = p.getMarketplace();
		System.out.println(mp.getBaseUrl());
		
	}

}
*/