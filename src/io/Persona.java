package io;

import java.io.Serializable;

public class Persona implements Serializable {

	private static final long serialVersionUID = 4031373284653622354L;
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona() {
		nome = "";
		cognome = "";
		eta = 0;
	}
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
}
