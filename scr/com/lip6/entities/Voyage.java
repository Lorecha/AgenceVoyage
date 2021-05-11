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
  
  @OneToOne(mappedBy="voyage",cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
 private Formule formule;
  
  @OneToMany(mappedBy="voyage",cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Reservation> mesReservations;   //voyage "voit" la liste de reservaation => y acceder

  @OneToOne(mappedBy="idDestination")
  private Destination destination;
  private static int compteur=0;



	public Voyage() {
	super();
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



	


	public Formule getFormule() {
		return formule;
	}



	public void setFormule(Formule formule) {
		this.formule = formule;
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





	public Voyage(long idVoyage, double prix, Formule formule, List<Reservation> mesReservations,
			Destination destination) {
		super();
		this.idVoyage = idVoyage;
		this.prix = prix;
		this.formule = formule;
		this.mesReservations = mesReservations;
		this.destination = destination;
	}



	@Override
	public String toString() {
		return "Voyage{" +
				"idVoyage=" + idVoyage +
				", prix=" + prix +
				", Formule=" + formule +
				", mesReservations=" + mesReservations +
				", destination=" + destination +
				'}';
	}
}