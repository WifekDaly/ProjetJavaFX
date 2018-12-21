package app;

import java.io.Serializable;

public class contact  implements Serializable {
	private int numero;
	private String nom;
	private String numerotel;
	private appels appel;
	
	public contact(int numero, String nom, String numerotel) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.numerotel = numerotel;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumerotel() {
		return numerotel;
	}

	public void setNumerotel(String numerotel) {
		this.numerotel = numerotel;
	}

	public appels getAppel() {
		return appel;
	}

	public void setAppel(appels appel) {
		this.appel = appel;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		contact c = (contact)obj;
		return (numero== c.getNumero() && this.nom.equals(c.getNom()) && this.numerotel.equals(c.getNumerotel()));
	
		}

}
