package com.lip6.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.io.Serializable;

@Entity
@Table (name="reservation")

public class Reservation implements Serializable{


	private static final long serialVersionUID = 351281611899390797L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int idReservation; 

	@ManyToMany
	private List<Voyageur> listevoyageurs;

	
	@ManyToOne
	@JoinColumn (name="client")
	private Client client;//dans la class client
    
	@ManyToOne
	@JoinColumn (name="voyage")
	private Voyage voyage;
	
	protected double prixtotal;
	
	
	private enum EtatsReservation {   EnCours,  EnAttente,  Acceptee,  Refusee;}

	static int compteur=0;
	
	
	
	



	public Reservation(int idReservation, List<Voyageur> listevoyageurs, Client client, double prixtotal,
			Voyage voyage) {
		super();
		this.idReservation = idReservation;
		this.listevoyageurs = listevoyageurs;
		this.client = client;
		this.prixtotal = prixtotal;
		this.voyage = voyage;
	}







	public Reservation() {
		super();
	}



}


//choisir l'offre -il a deja choisit quanf on vas lui faire un dossier
//choisir la liste de voyageur
//choisir l'assurance

