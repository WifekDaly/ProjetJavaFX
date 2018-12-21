package app;

import java.io.IOException;



public class main {

	public static void main(String[] args) throws ClassNotFoundException, IOException   {
		IAappareil a =new appareil();
		contact c =new contact(1,"c","1111111");
		contact c1 =new contact(2,"b","111111");
		contact c4=new contact(5,"f","111114");
		contact c2 =new contact(3,"a","111112");
		
		a.stocker(c1);
		a.stocker(c2);
		a.stocker(c4);
	   a.supprimer(c4);
		a.modifier("111111", "123456", "b");
		
	}

}
