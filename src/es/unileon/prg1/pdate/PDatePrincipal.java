package es.unileon.prg1.pdate;

/**
 * Clase Date
 * *
 * @author david
 * @version 0.1
 */


public class PDatePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date miFecha = new Date();
		Date miFecha2 = new Date (1,11,2019);
		
		System.out.println(miFecha);
		System.out.println(miFecha2);
		
		if(miFecha.isSameYear(miFecha2)) {
			System.out.println("Es el mismo anyo");
		}else {
			System.out.println("Es el distinto anyo");
		}
		
		if(miFecha.isSameYearNoIf(miFecha2)) {
			System.out.println("Es el mismo anyo");
		}else {
			System.out.println("Es el distinto anyo");
		}
			
	}

}
