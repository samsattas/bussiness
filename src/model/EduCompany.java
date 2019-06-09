package model;

public class EduCompany extends Service{
//CONSTANTS
	public final static String BA = "Bachillerato";
	public final static String UN = "Universidad";

//ATTRIBUTES
	private String registerNumber;
	private int hqYears;
	private int ranking;
	private String directorName;
	private String sector;
	private int students1and2;
	private int totalStudents;

//CONSTRUCTOR
	public EduCompany(String name, int nit, String adress, int phoneNumber, int numberOfEmloyees, double actives, Date constitutionDate, String type, String agentName, String registerNumber,int hqYears, int ranking, String directorName, String sector, int students1and2, int totalStudents){
		super(name, nit, adress, phoneNumber, numberOfEmloyees, actives, constitutionDate, type, agentName);
		this.registerNumber = registerNumber;
		this.hqYears = hqYears;
		this.ranking = ranking;
		this.directorName = directorName;
		this.sector = sector;
		this.students1and2 = students1and2;
		this.totalStudents =totalStudents;
	}

//GETTERS & SETTERS
	public String getRegisterNumber(){
		return registerNumber;
	}

	public int getHqYears(){
		return hqYears;
	}

	public int getRanking(){
		return ranking;
	}

	public String getDirectorName(){
		return directorName;
	}

	public String getSector(){
		return sector;
	}

	public int getStudent1and2(){
		return students1and2;
	}

	public int getTotalStudents(){
		return totalStudents;
	}


	public void setRegisterNumber(String registerNumber){
		this.registerNumber = registerNumber;
	}

	public void setHqYears(int hqYears){
		this.hqYears = hqYears;
	}

	public void setRanking(int ranking){
		this.ranking = ranking;
	}

	public void setDirectorName(String directorName){
		this.directorName = directorName;
	}

	public void setSector(String sector){
		this.sector = sector;
	}

	public void setStudents1and2(int students1and2){
		this.students1and2 = students1and2;
	}

	public void setTotalStudents(int totalStudents){
		this.totalStudents = totalStudents;
	}

}