package com.lip6.entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;


@Entity
@Table(name="Prestationjoined")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Prestation  implements Serializable{


	private static final long serialVersionUID = 9066182263192503871L;
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idP=0;
	@ManyToOne
	@JoinColumn (name="voyage")
	private Voyage voyage;
	private Date dateDepart;
	private Date dateArrivee;
	private double prixHT;
	private String compagnie;
	

	public Prestation() {
		super();
	}


	public long getIdP() {
		return idP;
	}


	public void setIdP(long idP) {
		this.idP = idP;
	}


	public Voyage getVoyage() {
		return voyage;
	}


	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}


	public Date getDateDepart() {
		return dateDepart;
	}


	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}


	public Date getDateArrivee() {
		return dateArrivee;
	}


	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}


	public double getPrixHT() {
		return prixHT;
	}


	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}


	public String getCompagnie() {
		return compagnie;
	}


	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}


	public Prestation(long idP, Voyage voyage, Date dateDepart, Date dateArrivee, double prixHT, String compagnie) {
		super();
		this.idP = idP;
		this.voyage = voyage;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prixHT = prixHT;
		this.compagnie = compagnie;
	}
	

}