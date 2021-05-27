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
  private String aeroportdepart;
  private String aeroportarrive;
  private String compagnie;
  private static int compteur=0;
  
  
public Vol() {
	super();
}

public long getIdVol() {
	return idVol;
}

public void setIdVol(long idVol) {
	this.idVol = idVol;
}

public String getAeroportdepart() {
	return aeroportdepart;
}

public void setAeroportdepart(String aeroportdepart) {
	this.aeroportdepart = aeroportdepart;
}

public String getAeroportarrive() {
	return aeroportarrive;
}

public void setAeroportarrive(String aeroportarrive) {
	this.aeroportarrive = aeroportarrive;
}

public String getCompagnie() {
	return compagnie;
}

public void setCompagnie(String compagnie) {
	this.compagnie = compagnie;
}

public Vol(long idVol, String aeroportdepart, String aeroportarrive, String compagnie) {
	super();
	this.idVol = idVol;
	this.aeroportdepart = aeroportdepart;
	this.aeroportarrive = aeroportarrive;
	this.compagnie = compagnie;
}

 


}