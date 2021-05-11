package com.lip6.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Hotel")

public class Hotel extends Prestation {

	private static final long serialVersionUID = 1213814932472705528L;


	private long idHotel;
	
    private String nomHotel;
    private int nrEtoiles;
  private TypeChambreprestation  typeChambreprestation  ;
  private TypeChambre typechambre;
  
        
    
   
	
    @OneToOne
	@JoinColumn(name="ADR_ID", referencedColumnName="addressId")
	private Address address;
	

	public Hotel (){super();}

	

	public Hotel(long idHotel, String nomHotel, int nrEtoiles, Address address) {
		super();
		this.idHotel = idHotel;
		this.nomHotel = nomHotel;
		this.nrEtoiles = nrEtoiles;
		this.address = address;
	}



	public Hotel(long idHotel, String nomHotel, int nrEtoiles, TypeChambreprestation typeChambreprestation,
			TypeChambre typechambre, Address address) {
		super();
		this.idHotel = idHotel;
		this.nomHotel = nomHotel;
		this.nrEtoiles = nrEtoiles;
		this.typeChambreprestation = typeChambreprestation;
		this.typechambre = typechambre;
		this.address = address;
	}



	public long getId() {
		return idHotel;
	}

	public void setId(long id) {
		this.idHotel = id;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public int getNrEtoiles() {
		return nrEtoiles;
	}

	public void setNrEtoiles(int nrEtoiles) {
		this.nrEtoiles = nrEtoiles;
	}

	public Address getAdresse() {
		return address;
	}

	public void setAdresse(Address adresse) {
		this.address = adresse;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Hotel)) return false;
		Hotel hotel = (Hotel) o;
		return getId() == hotel.getId() && getNrEtoiles() == hotel.getNrEtoiles() && getNomHotel().equals(hotel.getNomHotel()) && getAdresse().equals(hotel.getAdresse());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getNomHotel(), getNrEtoiles(), getAdresse());
	}

	@Override
	public String toString() {
		return "Hotel{" +
				"idclient=" + idHotel +
				", nomHotel='" + nomHotel + '\'' +
				", nrEtoiles=" + nrEtoiles +
				", adresse=" + address +
				'}';
	}
	/**
 * @param dateDepart
 * @param dateArrivee
 * @param prixHT
 */

}