package com.lip6.resources;


	import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
	import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.Context;
	import javax.ws.rs.core.MediaType;
	import javax.ws.rs.core.Request;
	import javax.ws.rs.core.Response;
	import javax.ws.rs.core.UriInfo;
	import javax.xml.bind.JAXBElement;

import com.lip6.daos.RaddclientDao;
import com.lip6.model.Raddclient;
import com.lip6.services.ServiceClient;



	public class RaddclientResource {
	    @Context
	    UriInfo uriInfo;
	    @Context
	    Request request;
	    String id;
	    public RaddclientResource(UriInfo uriInfo, Request request) {
	        this.uriInfo = uriInfo;
	        this.request = request;
	        
	    }

	    @POST
	    @Produces(MediaType.TEXT_HTML)
	    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	    public void newTodo(@FormParam("fname") String fname, 
	    		            @FormParam("lname") String lname,
	    		            @FormParam("email") String email,
	    		            @FormParam("civilite") String civilite,
	    		            @FormParam("rue") String rue,
	    		            @FormParam("ville") String ville,
	    		            @FormParam("codepostal") String codepostal,
	    		            @FormParam("region") String region,
	    		            @FormParam("pays") String pays,
	    		            @FormParam("age") String age,
	    		            @FormParam("nrp") String nrp,
	    		            @Context HttpServletResponse servletResponse) throws IOException {
	        Raddclient clientresurce = new Raddclient(fname,lname,email,civilite,rue,ville,codepostal,region,pays,age,nrp);
	        
	        RaddclientDao.instance.getModel().put(clientresurce);

	        servletResponse.sendRedirect("../CreateClient.jsp");
	    }
	    
}
