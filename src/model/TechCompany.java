package model;

public class TechCompany extends Service implements Trees{
//CONSTANTS	
	public final static String CC = "Consultoria capacitacion";
	public final static String DSM = "Desarrollo de software a la medida";
	public final static String IS = "Infraestructura como servicio";
	public final static String SS = "Software como servicio";
	public final static String PS = "Plataforma como servicio";

//ATTRIBUTES
	private String service;
	private double energy;

//CONSTRUCTOR
	public TechCompany(String name, int nit, String adress, int phoneNumber, int numberOfEmloyees, double actives, Date constitutionDate, String type, String agentName, String service, double energy){
		super(name, nit, adress, phoneNumber, numberOfEmloyees, actives, constitutionDate, type, agentName);
		this.service = service;
		this.energy = energy;
	}

//GETTERS & SETTERS
	public String getService(){
		return service;
	}

	public double getEnergy(){
		return energy;
	}


	public void setService(String service){
		this.service = service;
	}

	public void setEnergy(double energy){
		this.energy = energy;
	}


//METHODS
	public int xArbol(){
		int aux = 0;
		if(getEnergy()>0 && getEnergy()<=1000){
			aux = 8;
		}else if(getEnergy()>1000 && getEnergy()<=3000) {
			aux = 35;
		}else if(getEnergy()>3000){
			aux = 500;
		}

		return aux;
	}


	public String toString(){
		String msg = "";

		msg += "=================================\n";
		msg += "======== INFO TECNOLOGIA ========\n";
		msg += "SERVICIO: " + service + "\n";
		msg += "ENERGIA: " + energy + "\n";
		msg += "ARBOLES: " + xArbol() + "\n";
		msg += "=================================\n";

		return msg;
	}

}