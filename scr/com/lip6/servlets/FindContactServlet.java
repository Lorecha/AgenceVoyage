package com.lip6.servlets;
    import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
	import javax.servlet.http.*;
	import com.lip6.services.ServiceClient;

	public class FindContactServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	     public FindContactServlet() {
	        super();
	       
	    }
	     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    		
	 		response.getWriter().append("Served at: ").append(request.getContextPath());
	 	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	long idclient=Long.parseLong(request.getParameter("idclient"));
		
		response.setContentType(" text /html");
		PrintWriter out = response. getWriter ();
		ServiceContact sc=new ServiceContact();
		if (response  != null)
		{
		// �criture du HTML pour le client
		out.println ("<htm><body>Name : " +sc.findContact(Long.parseLong(request.getParameter("idclient"))).getFirstName() +"<br></br> "+sc.findContact(idclient).getLastName()+"<br></br> "+sc.findContact(idclient).getEmail()+ ".</body></html>");
		out.close(); 
		
		}
		else out.println ("<html><body>Je ne trouve pas l'idclient dans la base de donne</body></html>");
	}*/
	
	/*	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			long idclient=Long.parseLong(request.getParameter("idclient"));
			ServiceContact sc=new ServiceContact();
			sc.findContact(idclient);
			
		}*/

	}

}