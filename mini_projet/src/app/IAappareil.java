package app;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface IAappareil {
public void stocker (contact c) throws IOException, ClassNotFoundException;
public void stocker1(contact c);
public void supprimer(contact c) throws IOException ,ClassNotFoundException;
public void modifier (String ancTel,String nvTel,String nom) throws IOException,ClassNotFoundException;
public void enregistrer (appels a , String numtel) throws ClassNotFoundException, IOException ;
public contact consulter(int numero) throws Exception,ClassNotFoundException;
public List<contact> consulter(String mc) throws ClassNotFoundException, IOException;
public double coutTotalAppels();
public double coutAppels(Date d1,Date d2);
public double coutAppels(int numero);

}