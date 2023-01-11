package model;

import java.time.LocalDate;

public class Console {

	private String nom;
	private double prix;
	private String date;

	public Console(String nom, double prix, String date) {
		this.nom = nom;
		this.prix = prix;
		this.date = date;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
