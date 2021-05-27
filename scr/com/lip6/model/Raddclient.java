package com.lip6.model;

public class Raddclient {
	private String fname; //nom
	private String lname; //prenom
	private String  email;
	private String civilite;
	private String rue;
	private String ville;
	private String codepostal;
	private String region;
	private String pays;
	private String age; 
	private String nrp; //nr carte d'indentité
	public Raddclient() {
		super();
	}
	
	public Raddclient(String fname, String lname, String email, String civilite, String rue, String ville,
			String codepostal, String region, String pays, String age, String nrp) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.civilite = civilite;
		this.rue = rue;
		this.ville = ville;
		this.codepostal = codepostal;
		this.region = region;
		this.pays = pays;
		this.age = age;
		this.nrp = nrp;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
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
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNrp() {
		return nrp;
	}
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	
}
