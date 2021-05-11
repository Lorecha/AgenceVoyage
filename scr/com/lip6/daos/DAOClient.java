package com.lip6.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.lip6.entities.Address;
import com.lip6.entities.Client;
import com.lip6.entities.Personne;
import com.lip6.entities.Voyageur;

import org.springframework.stereotype.Repository;

import com.lip6.util.JpaUtil;

@Repository("RepDAOClient")
public class DAOClient implements IDAOClient {

	public boolean addClient(String fname,String lname, String email,String civilite, String rue,String ville, String codepostal,String region,String pays, String age, String nrp)
	{
		 boolean success=false;

			try {
		    EntityManager em=JpaUtil.getEmf().createEntityManager();

			// 2 : Ouverture transaction 
			EntityTransaction tx =  em.getTransaction();
			tx.begin();
			
			// 3 : Instanciation Objet(s) m�tier (s)
	    	// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base


				Address adr= new Address();
				adr.setRue(rue);
				adr.setVille(ville);
				adr.setCodePostal(codepostal);
				adr.setRegion(region);
				adr.setPays(pays);
				
			/*	Personne pers=new Personne();
				pers.setNom(fname);
				pers.setPrenom(lname);
				pers.setCivilite(civilite);
				pers.setEmail(email);
				pers.setAddress(adr);
						*/
				
				
				
				Voyageur v= new Voyageur();
				v.setNom(fname);
				v.setPrenom(lname);
				v.setAddress(adr);
				v.setCivilite(civilite);
				v.setEmail(email);
				v.setAge(age);
				v.setNumeroPieceIdentite(nrp);
				
				Client client =new Client(fname,email);
				client.setAddress(adr);
				client.setPrenom(v.getPrenom());
				
				 
				em.persist(adr)	;
			//   em.persist(pers);	
		      em.persist(v);
          	     //on vas dire que le client est aussi un voyageur
			em.persist(client);
			
			
			//ici l'objet est dans un �tat manag� par l'EM, pas besoin d'un nouveau persist
			
			
			// 5 : Fermeture transaction 
			tx.commit();
			
			//ici l'objet est dans un �tat d�tach� de l'EM, la modif ne sera pas commit�e

			 
			// 6 : Fermeture de l'EntityManager et de unit� de travail JPA 
			em.close();
		//	System.out.println("les contact ajoutes"+pers+v+client);
			// 7: Attention important, cette action ne doit s'executer qu'une seule fois et non pas à chaque instantiation du ContactDAO
			//Donc, pense bien à ce qu'elle soit la dernière action de votre application
			//JpaUtil.close();	
			
			success=true;
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			return success;
			
		}
	


	/*@Override
	public  void mamethod()
	{
		System.out.println("je suis dans la methode initiale");
	}
	public  void mamethod1(String name)
	{
		System.out.println("je suis dans la methode initiale et j'ai un parametre"+name );
	}*/

}
