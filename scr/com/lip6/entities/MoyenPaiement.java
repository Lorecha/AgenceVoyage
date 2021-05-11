package com.lip6.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="MoyenPaiement" )
public class MoyenPaiement implements Serializable {
	private static final long serialVersionUID = -478494423186840723L;
	@Id
	private Long idPaiement;
	private String banque;
	private double solde;
	
	//@ManyToOne(targetEntity=lesidClient,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private ArrayList<Client> lesidClient;
	private String typem;

	public MoyenPaiement() {
		super();
	}

	public MoyenPaiement(Long idPaiement, String banque, double solde, ArrayList<Client> lesidClient, String typem) {
		this.idPaiement = idPaiement;
		this.banque = banque;
		this.solde = solde;
		this.lesidClient = lesidClient;
		this.typem = typem;
	}

	public Long getIdPaiement() {
		return idPaiement;
	}

	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Collection<Client> getLesidClient() {
		return lesidClient;
	}

	public void setLesidClient(ArrayList<Client> lesidClient) {
		this.lesidClient = lesidClient;
	}

	public String getTypem() {
		return typem;
	}

	public void setTypem(String typem) {
		this.typem = typem;
	}

	@Override
	public String toString() {
		return "MoyenPaiement{" +
				"idPaiement=" + idPaiement +
				", banque='" + banque + '\'' +
				", solde=" + solde +
				", lesidClient=" + lesidClient +
				", typem='" + typem + '\'' +
				'}';
	}
}