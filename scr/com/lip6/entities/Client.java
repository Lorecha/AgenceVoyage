package com.lip6.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.*;

/**
 *  Le client n'est pas forcement voyageur, c'est celui ou celle qui finance le voyage.
 */


@Entity
@Table(name="Client")
public class Client extends Personne implements java.io.Serializable{

	private static final long serialVersionUID = 8801534033779455526L;
	private static int nrclient=0;

	private long idClient;
	private String nom;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	private Collection <Reservation> clientReservations;
	
	public Client(long idClient) {
		super();
	}

	
	


	public Client( String nom, String email) {
		super();
	    this.idClient =++nrclient;
		this.nom = nom;
		this.email = email;
	}


	

	public Client() {
	}

	public Collection<Reservation> getReservation() {
		return clientReservations;
	}

	public void setReservation(Collection<Reservation> reservation) {
		this.clientReservations = reservation;
	}

	



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Client)) return false;
		Client client = (Client) o;
		return getReservation().equals(client.getReservation())  ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getReservation());
	}

	@Override
	public String toString() {
		return "Client{" +
				"reservation=" + clientReservations +
				"} " + super.toString();
	}
	//etapes : 1 il s'identifie, si il a deja  un commpte on le cherche et on le trouve
	//verifie s'il veut faire un achat
	//on lui démande s'il a choisi une voyage on fait une reservation
	//on lui demande  s'il veut payer on cherche s'il n'est pas deja enregistre dans le system
	//on bloque la reservation et on lui demande de payer
	//si oui alors il faut lui  demander  le mode paiement
	//si son compte peut etre solde on vas commander l'operation reservation
	//sinon on abandone et on lui demande de reesayer de trouvar une autre voyage on pourra lui proposer une selection de voyage a mois cher avec ses criters
	//crer une methode qui fait un tri de voyages selon des criters specifiques
	//on valide la reservation et on la clos
	// on envoie les infos generales en voyage
	//on fait une facture et on lui envoie
	//apres la date datedepart on clos la reservation
	//demander le mode de payement




}