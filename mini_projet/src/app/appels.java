package app;
import java.io.Serializable;
import java.util.Date;
public abstract class appels implements Serializable{

protected int numero;
protected Date dateAppel;
protected double dureeAppel;
protected contact contact;

public abstract double cout();

public appels(int numero, Date dateAppel, double dureeAppel) {
	super();
	this.numero = numero;
	this.dateAppel = dateAppel;
	this.dureeAppel = dureeAppel;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public Date getDateAppel() {
	return dateAppel;
}

public void setDateAppel(Date dateAppel) {
	this.dateAppel = dateAppel;
}

public double getDureeAppel() {
	return dureeAppel;
}

public void setDureeAppel(double dureeAppel) {
	this.dureeAppel = dureeAppel;
}

public contact getContact() {
	return contact;
}

public void setContact(contact contact) {
	this.contact = contact;
}
}
