package com.lip6.entities;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;



@Entity
@Table(name="Personne")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Pers_Type")


public class Personne  implements Serializable {
	private static final long serialVersionUID= -8244848810523933789L;
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long personneId;
	
	private String nom;
	private String prenom;
	private String civilite;
	private String email;
	
	@OneToOne
	@JoinColumn(name="ADR_ID", referencedColumnName="addressId")
	private Address address;

	public Personne() {
	}

	public Personne(long id, String nom, String prenom, String civilite, String email, Address adresse) {
		this.personneId = id;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.email = email;
		this.address = adresse;
	}

	public long getId() {
		return personneId;
	}

	public void setId(long id) {
		this.personneId = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address adresse) {
		this.address = adresse;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Personne)) return false;
		Personne personne = (Personne) o;
		return getId() == personne.getId() && getNom().equals(personne.getNom()) && getPrenom().equals(personne.getPrenom()) && getCivilite().equals(personne.getCivilite()) && getEmail().equals(personne.getEmail()) && getAddress().equals(personne.getAddress());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getNom(), getPrenom(), getCivilite(), getEmail(), getAddress());
	}

	@Override
	public String toString() {
		return "Personne{" +
				"idclient=" + personneId +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", civilite='" + civilite + '\'' +
				", email='" + email + '\'' +
				", adresse=" + address +
				'}';
	}
}