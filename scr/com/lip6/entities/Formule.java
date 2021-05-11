package com.lip6.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="formule")
 public class Formule implements Serializable{
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long idFormule;
	private static final long serialVersionUID = -6295139024940707957L;
 
	private double prixTotal;
	@OneToMany
	private Collection<Prestation> mesPrestation ;
   
	@OneToOne
    @JoinColumn (name="formule")
	private Voyage voyage;

	public Formule() {
		super();
	}


	public Formule(long idFormule, double prixTotal, ArrayList<Prestation> mesPrestation, Voyage voyage) {
		this.idFormule = idFormule;
		this.prixTotal = prixTotal;
		this.mesPrestation = mesPrestation;
		this.voyage = voyage;
	}

	public long getIdFormule() {
		return idFormule;
	}

	public void setIdFormule(long idFormule) {
		this.idFormule = idFormule;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Collection<Prestation> getMesPrestation() {
		return mesPrestation;
	}

	public void setMesPrestation(ArrayList<Prestation> mesPrestation) {
		this.mesPrestation = mesPrestation;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Formule)) return false;
		Formule formule = (Formule) o;
		return getIdFormule() == formule.getIdFormule() && Double.compare(formule.getPrixTotal(), getPrixTotal()) == 0 && getMesPrestation().equals(formule.getMesPrestation()) && getVoyage().equals(formule.getVoyage());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdFormule(), getPrixTotal(), getMesPrestation(), getVoyage());
	}

	@Override
	public String toString() {
		return "Formule{" +
				"idFormule=" + idFormule +
				", prixTotal=" + prixTotal +
				", mesPrestation=" + mesPrestation +
				", voyage=" + voyage +
				'}';
	}
	//formule f1.addPrestation(Hotel);
 //formule f1.addPrestation(Avion);
}