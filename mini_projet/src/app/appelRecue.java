package app;

import java.util.Date;

public class appelRecue extends appels {

	public appelRecue(int numero, Date dateAppel, double dureeAppel) {
		super(numero, dateAppel, dureeAppel);
		
	}

	@Override
	public double cout() {
		
		return 0;
	}

}
