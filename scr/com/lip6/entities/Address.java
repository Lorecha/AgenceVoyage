package com.lip6.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;


@Entity
@Table(name="address")
public class Address implements java.io.Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	 private String rue;
      private String ville;
     private String codePostal;
     private String region;
     private String pays; 

  public Address(long addressId) {
	  this.addressId = addressId;
  }
	

public Address(String rue, String ville, String codePostal, String region, String pays) {
    this.rue = rue;
    this.ville = ville;
    this.codePostal = codePostal;
    this.region = region;
    this.pays = pays;
  }

	public Address() {

	}

	public String getRue() {
	return rue;
}


public void setRue(String rue) {
	this.rue = rue;
}


public String getVille() {
	return ville;
}


public void setVille(String ville) {
	this.ville = ville;
}


public String getCodePostal() {
	return codePostal;
}


public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}


public String getPays() {
	return pays;
}


public void setPays(String pays) {
	this.pays = pays;
}


public String getRegion() {
	return region;
}


public void setRegion(String region) {
	this.region = region;
}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Address)) return false;
		Address address = (Address) o;
		return addressId == address.addressId && getRue().equals(address.getRue()) && getVille().equals(address.getVille()) && getCodePostal().equals(address.getCodePostal()) && getPays().equals(address.getPays()) && getRegion().equals(address.getRegion());
	}

	@Override
	public int hashCode() {
		return Objects.hash(addressId, getRue(), getVille(), getCodePostal(), getPays(), getRegion());
	}

	@Override
	public String toString() {
		return "Adresse:" +
				"addressId:" + addressId +
				", rue:'" + rue + '\'' +
				", ville:'" + ville + '\'' +
				", codePostal:'" + codePostal + '\'' +
				", pays:'" + pays + '\'' +
				", region:'" + region + '\'' +
				'}';
	}
}