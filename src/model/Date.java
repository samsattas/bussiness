package model;

public class Date{
	
//ATTRIBUTES
	private int day;
	private int month;
	private int year;

//CONSTRUCTOR
	public Date(int day, int month, int year){
	this.day = day;
	this.month = month;
	this.year = year;
	}

//GETTERS & SETTERS
	public  int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public  int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public  int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

//GET THE DATE: DD/MM/YYYY
	public String getFullDate(){
		String aDate = "";
		aDate += Integer.toString(day);
		aDate += "/";
		aDate += Integer.toString(month);
		aDate += "/";
		aDate += Integer.toString(year);
		return aDate;
	}

} 
