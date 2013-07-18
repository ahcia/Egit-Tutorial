package com.javaworld.hotels.businessobjects;

public class Hotel {
	
	private String nom;
	private String adresse;
	private String ville;
	private int etoiles;

	public Hotel(String nom, String adresse, String ville, int etoiles) {
		this.ville=ville;
		this.adresse=adresse;
		this.etoiles=etoiles;
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getEtoiles() {
		return etoiles;
	}

	public void setEtoiles(int etoiles) {
		this.etoiles = etoiles;
	}

}
