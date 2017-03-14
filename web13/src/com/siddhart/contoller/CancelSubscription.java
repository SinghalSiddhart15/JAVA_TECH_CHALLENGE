package com.siddhart.contoller;


	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import org.codehaus.jackson.map.ObjectMapper;
	import com.siddhart.bean.Parent;
	import com.siddhart.domain.UserDetails;
	import com.siddhart.domain.ReturnSuccess;
	import com.siddhart.service.DeletingUser;
	import com.siddhart.utils.Collection;
	import com.siddhart.utils.OAuth;


		@WebServlet("/CancelSubscription")
		public class CancelSubscription extends HttpServlet {
			
			private static final long serialVersionUID = 1L;
		       
			    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
			    	 
			    	 response.setContentType("application/json");
			         PrintWriter out = response.getWriter();
			         ObjectMapper mapper = new ObjectMapper();
			         String eventUrl= (String) request.getParameter("eventUrl");
			         
			         String myurl = request.getParameter("eventUrl");
				     Parent p = new OAuth().Sign(myurl);
				    	
				     UserDetails ud = new UserDetails();
				     ud = new Collection().collection(p);
			         
				     DeletingUser.delete(ud);
			         
			         
			         ReturnSuccess m= new ReturnSuccess();
			         m.setSuccess(true);
			         
			         String json = mapper.writeValueAsString(m);
			         out.print(json);
			         System.out.println(eventUrl);
			         				
				}
			}
