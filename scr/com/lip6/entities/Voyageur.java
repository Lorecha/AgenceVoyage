package com.lip6.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="Voyageur")
@DiscriminatorValue("VOYAGEUR")
public class Voyageur extends Personne implements Serializable{

	private static final long serialVersionUID = -3237072059718195085L;

    
	private long idVoyageur;
	private String numeroPieceIdentite;
	private String age;
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable
	(
			name="vreservations",
		      joinColumns= @JoinColumn(name="idVoyageur", referencedColumnName="idVoyageur"),
		      inverseJoinColumns=@JoinColumn(name="idreservation", referencedColumnName="idReservation", unique=true) 
		  )	
	private List <Reservation > listereservations;
	private static int compteur=0;

	
	 
	 public Voyageur() {
		super();
			}


	




	public Voyageur(long idVoyageur, String numeroPieceIdentite, String age, List<Reservation> listereservations) {
		super();
	//	this.idVoyageur = idVoyageur;
		this.numeroPieceIdentite = numeroPieceIdentite;
		this.age = age;
		this.listereservations = listereservations;
	}


/*	public long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}
	*/

	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}



	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}





	public List<Reservation> getListereservations() {
		return listereservations;
	}



	public void setListereservations(List<Reservation> listereservations) {
		this.listereservations = listereservations;
	}

/*	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Voyageur)) return false;
		if (!super.equals(o)) return false;
		Voyageur voyageur = (Voyageur) o;
		return getIdVoyageur() == voyageur.getIdVoyageur() && getAge() == voyageur.getAge() && getNumeroPieceIdentite().equals(voyageur.getNumeroPieceIdentite()) && getListereservations().equals(voyageur.getListereservations());
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getIdVoyageur(), getNumeroPieceIdentite(), getAge(), getListereservations());
	}

	@Override
	public String toString() {
		return "Voyageur{" +
				"idVoyageur=" + idVoyageur +
				", numeroPieceIdentite='" + numeroPieceIdentite + '\'' +
				", age=" + age +
				", Reservation=" + listereservations +
				"} " + super.toString();
	}*/
}