package model;

public abstract class Company{
public static String[] organizationType = {"AGRICULTURA, CAZA, SILVICULTURA Y PEZCA", "EXPLOTACION DE MINAS Y CANTERAS", "INDUSTRIA MANUFACTURERA", "ELECTRICIDAD, GAS Y VAPOR", "CONSTRUCCION", "COMERCIO AL POR MAYOR Y AL POR MENOR", "TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES", "EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS", "COMUNALES, SOCIALES"};

//ATTRIBUTES
	private String name;
	private int nit;
	private String adress;
	private int phoneNumber;
	private int numberOfEmloyees;
	private double actives;
	private Date constitutionDate;
	private String type;
	private String agentName;

//CONSTRUCTOR
	public Company(String name, int nit, String adress, int phoneNumber, int numberOfEmloyees, double actives, Date constitutionDate, String type, String agentName){
		this.name = name;
		this.nit = nit;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.numberOfEmloyees = numberOfEmloyees;
		this.actives = actives;
		this.constitutionDate = constitutionDate;
		this.type = type;
		this.agentName = agentName;
	}

//GETTERS & SETTERS
	public String getName(){
		return name;
	}

	public int getNit(){
		return nit;
	}

	public String getAdress(){
		return adress;
	}

	public int getPhoneNumber(){
		return phoneNumber;
	}

	public int getNumberOfEmployees(){
		return numberOfEmloyees;
	}

	public double getActives(){
		return actives;
	}

	public Date getConstitutionDate(){
		return constitutionDate;
	}

	public String getType(){
		return type;
	}

	public String getAgentName(){
		return agentName;
	}


	public void setName(String name){
		this.name = name;
	}

	public void setNit(int nit){
		this.nit = nit;
	}

	public void setAdress(String adress){
		this.adress = adress;
	}

	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public void setNumberOfEmployees(int numberOfEmloyees){
		this.numberOfEmloyees = numberOfEmloyees;
	}

	public void setActives(double actives){
		this.actives = actives;
	}

	public void setConstitutionDate(Date constitutionDate){
		this.constitutionDate = constitutionDate;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setAgentName(String agentName){
		this.agentName = agentName;
	}

}