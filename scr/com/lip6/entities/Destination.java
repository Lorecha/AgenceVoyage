package com.lip6.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="destination")
public class Destination implements Serializable {
    

	private static final long serialVersionUID = -8723268765740312517L;


	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne
	@JoinColumn(name="idVoyage")
	private Voyage idDestination;
	private String pays;
    private String continent;
	
    public Destination() {
		super();
		
	}

	public Destination(Voyage idDestination, String pays, String continent) {
		this.idDestination = idDestination;
		this.pays = pays;
		this.continent = continent;
	}

	public Voyage getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(Voyage idDestination) {
		this.idDestination = idDestination;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Destination)) return false;
		Destination that = (Destination) o;
		return getIdDestination().equals(that.getIdDestination()) && getPays().equals(that.getPays()) && getContinent().equals(that.getContinent());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdDestination(), getPays(), getContinent());
	}

	@Override
	public String toString() {
		return "Destination{" +
				"idDestination=" + idDestination +
				", pays='" + pays + '\'' +
				", continent='" + continent + '\'' +
				'}';
	}
}
