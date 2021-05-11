package com.lip6.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lip6.services.ServiceClient;


public class AddClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static  String fname = null;
	public static String lname=null;
	public static String civilite=null;
	public static String email=null;
	public static String rue=null;
	public static String ville=null;
	public static String codepostal=null;
	public static String region=null;
	public static String pays=null;
	public static String age=null;
	public static String nrp=null;
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		
         fname=request.getParameter("fname");
		 lname=request.getParameter("lname");
		 email=request.getParameter("email");
		 civilite=request.getParameter("civilite");
		 rue=request.getParameter("rue");
		 ville=request.getParameter("ville");
		 codepostal=request.getParameter("codepostal");
		 region=request.getParameter("region");
		 pays=request.getParameter("pays");
		age=request.getParameter("age");
		 nrp=request.getParameter("nrp");


   /*      String[] allBeanNames = context.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName + "******************");
        }*/

       
        ServiceClient sc = (ServiceClient)context.getBean("ServClient");
        sc.addClient(fname, lname,email,civilite,rue, ville,  codepostal,region, pays, age, nrp);
       // System.out.println(c);
      
        /*IDAOContact dao =(IDAOContact)context.getBean("cdao");
		dao.addContact("Xavier", "Blanc", "Test@mail.com");
		
		
		//long idclient=Long.parseLong(request.getParameter("idclient"));
		
		
        Contact c = (Contact)context.getBean("contact");
        System.out.println(c);
        Contact c1 = (Contact)context.getBean("contact1");
        System.out.println(c1);
        
        
				String fname=request.getParameter("fname");
				String lname=request.getParameter("lname");
				String email=request.getParameter("email");
				ServiceContact sc = new ServiceContact();
				sc.addContact(fname,lname,email);
				
				sc.addContact(c.getFirstName(), c.getEmail(), c.getLastName());*/
				
	}

}
