package com.lip6.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lip6.daos.IDAOClient;

@Service("ServClient")
public class ServiceClient {
	@Autowired
	@Qualifier("RepDAOClient")
	private IDAOClient dao;

//	public void addContact(Contact contact) {
// 	//dao.addContact(contact);
// 	dao.mamethod1(AddContactServlet.fname);
// }
//post
	public void addClient(String fname,String lname,String email, String civilite,String rue, String ville, String codepostal,String region,String pays, String age, String nrp) {
		dao.addClient(fname,lname,email, civilite,rue, ville,  codepostal,region, pays, age, nrp);
    }
}
