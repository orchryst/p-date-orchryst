package es.unileon.prg1.pdate;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
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

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
