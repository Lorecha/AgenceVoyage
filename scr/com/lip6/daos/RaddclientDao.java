package com.lip6.daos;

import com.lip6.model.Raddclient;

public enum  RaddclientDao {
 instance;
	private Raddclient contentProvider;
	private RaddclientDao ()
	{
		System.out.println("une nouvelle ressource");
		contentProvider =new Raddclient();
	}
	public Raddclient getModel()
	{
		return contentProvider;
	}
}
