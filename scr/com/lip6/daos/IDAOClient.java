package com.lip6.daos;




public interface IDAOClient {
	//public boolean addClient(Client c);
   
  //  public void mamethod();
  //   public  void mamethod1(String name);
	public boolean addClient(String fname, String lname, String email, String civilite, String rue, String ville,
			String codepostal, String region, String pays, String age, String nrp);
	

}
