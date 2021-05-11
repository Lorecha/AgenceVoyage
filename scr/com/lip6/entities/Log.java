package com.lip6.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table (name="Log")
public class Log implements java.io.Serializable{

	
	private static final long serialVersionUID = -5081966520803294301L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne
	@JoinColumn(name="logId", referencedColumnName="idClient")
	private Client idLog;
	private String userName;
	private String pasword;

	public Log(Client idLog) {

	}

	public Log(Client idLog, String userName, String pasword) {
		this.idLog = idLog;
		this.userName = userName;
		this.pasword = pasword;
	}

	public Log() {

	}

	public Client getIdLog() {
		return idLog;
	}

	public void setIdLog(Client idLog) {
		this.idLog = idLog;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Log)) return false;
		Log log = (Log) o;
		return getIdLog().equals(log.getIdLog()) && getUserName().equals(log.getUserName()) && getPasword().equals(log.getPasword());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdLog(), getUserName(), getPasword());
	}

	@Override
	public String toString() {
		return "Log{" +
				"idLog=" + idLog +
				", userName='" + userName + '\'' +
				", pasword='" + pasword + '\'' +
				'}';
	}

}
