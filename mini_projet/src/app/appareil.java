package app;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class appareil implements IAappareil {
   

	private List<contact> contacts = new ArrayList<contact>();
	private List<contact> contacts1=new ArrayList<contact>();
   private Map<Integer,appels> appel=new HashMap<Integer,appels>();
   
   
   public void stocker1(contact c)
   {
	   contacts1.add(c);
   }
 

   @Override

public void stocker (contact c) throws IOException, ClassNotFoundException
{
	   
	 
	lire();
	if (! contacts.contains(c))
	{
	contacts.add(c);
	}
	ecrire();
	contacts = null;
	  }







@Override

public void supprimer (contact c) throws IOException, ClassNotFoundException
{
	
	    lire();
        contacts.remove(c);
        ecrire();
        contacts=null;   
           
        
        
		
        
}

    
    	
    	public void lire() throws IOException,ClassNotFoundException
    	{
    		   
    		
    		if ((new File("contacts.dat")).exists())
    		{
    		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contacts.dat"));
    		 contacts = (ArrayList<contact>) ois.readObject();
    		 ois.close();      		
    		}
    		else
    		{
    			contacts = new ArrayList<contact>();
    		}
    	
    	
    	}

    	public void ecrire() throws IOException,ClassNotFoundException
    	{
    		 File f = new File("contacts.dat")  ;
    		 if (f.exists())
    		 {
    		 f.delete();
    		 }
    		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contacts.dat"));   
    		oos.writeObject(contacts);      		
    		    oos.close();
    		    
    	
    	}

    	public void modifier (String ancTel,String nvTel,String nom) throws IOException,ClassNotFoundException
    	{
    		    lire();
        		    
    	        ListIterator<contact> it = contacts.listIterator();
    	        contact ct=null;
    	        while (it.hasNext())
    	        {
    	            ct = it.next();
    	        	if(ct.getNom().equals(nom) && ct.getNumerotel().equals(ancTel)) {
    		    	it.set(new contact(ct.getNumero(),ct.getNom(),nvTel));
					ecrire();
					contacts=null;
        		    	}
    	        }
    		
			
    		}
    		
    
   
				
    		
    
   

	@Override
	public void enregistrer (appels a , String numtel) throws ClassNotFoundException, IOException {
		lire();
		contact c1=null;
		for(contact c:contacts)
			if(c.getNumerotel().equals(numtel)) {
		c1=c;
		break;
			}
		contacts=null;
		a.setContact(c1);
		appel.put(a.getNumero(), a);
		
		
		
	}

	@Override
	public contact consulter(int numero) throws Exception {
		lire();
		for(contact c:contacts)
		{
			if(c.getNumero()==numero)
				return c;
		}
		contacts=null;
		throw new Exception("contact"+numero+"Introuvable");
		
		
	}

	@Override
	public List<contact> consulter(String mc) throws ClassNotFoundException, IOException {
		lire();
		List<contact> cts=new ArrayList<contact>();
		for(contact c:contacts) {
			if(c.getNom().contains(mc))
				cts.add(c);
		}
		contacts=null;
		return cts;
	}

	@Override
	public double coutTotalAppels() {
		double total=0;
		for(appels a:appel.values())
			total=total+a.cout();
		return total;
	}

	@Override
	public double coutAppels(Date d1, Date d2) {
		double total=0;
		for(appels a:appel.values()) {
			if((a.getDateAppel().getTime()>=d1.getTime())
					&&((a.getDateAppel().getTime()<=d2.getTime())))
		
			total=total+a.cout();
		}
		return total;
		
		
	}

	@Override
	public double coutAppels(int numero) {
		double total=0;
		for(appels a:appel.values()) {
			if(a.getContact().getNumero()==numero)
				total=total+a.cout();
		}
		
		return 0;
	}
    
   


}
