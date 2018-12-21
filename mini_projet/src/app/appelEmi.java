package app;

import java.util.Date;

public class appelEmi extends appels {

	public appelEmi(int numero, Date dateAppel, double dureeAppel) {
		super(numero, dateAppel, dureeAppel);
		
	}

	@Override
	public double cout() {
	
		return dureeAppel*2;
	}

}
