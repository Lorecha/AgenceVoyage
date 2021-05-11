package com.lip6.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="avion")
public class Vol extends Prestation implements Serializable{
	
	private static final long serialVersionUID = 5807345588748831890L;

	private long  idVol;
  private String aeroport;
  private String compagnie;
  private static int compteur=0;

 

public Vol(long idVol, String aeroport, String compagnie) {
	super();
	this.idVol = idVol;
	this.aeroport = aeroport;
	this.compagnie = compagnie;
}

public Vol(int idVol, String aeroport, String compagnie) {
	super();
	this.idVol = ++compteur;
	this.aeroport = aeroport;
	this.compagnie = compagnie;
}

	


	public Vol(long idP, Date dateDepart, Date dateArrivee, double prixHT, String compagnie) {
	super(idP, dateDepart, dateArrivee, prixHT, compagnie);
	// TODO Auto-generated constructor stub
}

	public Vol() {

	}

	public long getIdVol() {
		return idVol;
	}

	public void setIdVol(long idVol) {
		this.idVol = idVol;
	}

	public String getAeroport() {
		return aeroport;
	}

	public void setAeroport(String aeroport) {
		this.aeroport = aeroport;
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		Vol.compteur = compteur;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Vol)) return false;
		if (!super.equals(o)) return false;
		Vol vol = (Vol) o;
		return getIdVol() == vol.getIdVol() && getAeroport().equals(vol.getAeroport()) && getCompagnie().equals(vol.getCompagnie());
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getIdVol(), getAeroport(), getCompagnie());
	}

	@Override
	public String toString() {
		return "Vol{" +
				"idVol=" + idVol +
				", aeroport='" + aeroport + '\'' +
				", compagnie='" + compagnie + '\'' +
				"} " + super.toString();
	}
}