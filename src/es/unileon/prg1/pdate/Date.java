package es.unileon.prg1.pdate;

/**
 * Implemetacion de la clase Date para Prg1
 * *
 * @author david
 * @version 0.1
 */

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	Date(){
		this.day = 1;
		this.month = 1;
		this.year = 2020;	
	}
	
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean isSameYear(Date miFecha)	{
		boolean retorno = false;
		
		if(this.year == miFecha.getYear());
			retorno = true;
		System.out.println("Opcion If");
		return retorno;
	}
	
	public boolean isSameYearNoIf(Date miFecha)	{
		System.out.println("Opcion NoIf");
		return (this.year == miFecha.getYear());
	}
	
/*
	isSameMonth
	isSameDay
	isSame
*/	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
