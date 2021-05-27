package com.lip6.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



/** 
 *  La classe Domaine.Voyage est la classe m?tier.
 *  Cette classe est renvoy?e dans une liste par Domaine.AgenceVoyageService.
 */
@Entity
@Table (name="voyage")
public class Voyage implements Serializable {

  private static final long serialVersionUID = 4655746860756228481L;
  //private int numeroVoyage;
  //private Boolean statut;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idVoyage;
  
  private double prix;
  
 
  @OneToMany//(mappedBy="voyage",cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
  private List<Prestation> mesprestations;
  
  public List<Prestation> getMesprestations() {
	return mesprestations;
}



public Voyage() {
	super();
}



public void setMesprestations(List<Prestation> mesprestations) {
	this.mesprestations = mesprestations;
}



@OneToMany(mappedBy="voyage",cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Reservation> mesReservations;   //voyage "voit" la liste de reservaation => y acceder

  @OneToOne(mappedBy="idDestination")
  private Destination destination;
  private static int compteur=0;

public Voyage(long idVoyage, double prix, List<Prestation> mesprestations, List<Reservation> mesReservations,
		Destination destination) {
	super();
	this.idVoyage = idVoyage;
	this.prix = prix;
	this.mesprestations = mesprestations;
	this.mesReservations = mesReservations;
	this.destination = destination;
}



public long getIdVoyage() {
	return idVoyage;
}



public void setIdVoyage(long idVoyage) {
	this.idVoyage = idVoyage;
}



public double getPrix() {
	return prix;
}



public void setPrix(double prix) {
	this.prix = prix;
}



public List<Reservation> getMesReservations() {
	return mesReservations;
}



public void setMesReservations(List<Reservation> mesReservations) {
	this.mesReservations = mesReservations;
}



public Destination getDestination() {
	return destination;
}



public void setDestination(Destination destination) {
	this.destination = destination;
}



public static int getCompteur() {
	return compteur;
}



public static void setCompteur(int compteur) {
	Voyage.compteur = compteur;
}




}