package com.lip6.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.lip6.entities.Address;
import com.lip6.entities.Client;
import com.lip6.entities.Personne;
import com.lip6.entities.Voyageur;
import com.lip6.model.Raddclient;
import com.lip6.resources.RaddclientResource;

import org.springframework.stereotype.Repository;

import com.lip6.util.JpaUtil;

@Repository("RepDAOClient")
public class DAOClient implements IDAOClient {

	public boolean addClient(Raddclient modelclient)
	{
		 boolean success=false;

			try {
				EntityManager em=JpaUtil.getEmf().createEntityManager(); // 2 : Ouverture transaction 
				EntityTransaction tx =  em.getTransaction();
				tx.begin();
			
			

				Address adr= new Address();
				adr.setRue( modelclient.getRue());
				adr.setVille(modelclient.getVille());
				adr.setCodePostal(modelclient.getCodepostal());
				adr.setRegion(modelclient.getRegion());
				adr.setPays(modelclient.getPays());
			
				
				Voyageur v= new Voyageur();
				v.setNom(modelclient.getFname());
				v.setPrenom(modelclient.getLname());
				v.setAddress(adr);
				v.setCivilite(modelclient.getCivilite());
				v.setEmail(modelclient.getEmail());
				v.setAge(modelclient.getAge());
				v.setNumeroPieceIdentite(modelclient.getNrp());
				//dans l'ipotheze que le client est aussi un voyageur
				
				Client client =new Client(modelclient.getFname(),modelclient.getEmail());
				client.setAddress(adr);
				client.setPrenom(v.getPrenom());
				
				 
				em.persist(adr)	;
			    em.persist(v);
          	   	em.persist(client);
						
			tx.commit();
					
			em.close();
		
			success=true;
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			return success;
			
		}

	@Override
	public boolean addClient(String fname, String lname, String email, String civilite, String rue, String ville,
			String codepostal, String region, String pays, String age, String nrp) {
		// TODO Auto-generated method stub
		return false;
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
