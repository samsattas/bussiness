package model;

public class Product{//D

//ATTRIBUTES
	private String name;
	private String code;
	private double water;
	private int units;
	


//CONSTRUCTOR
	public Product(String name, String code, double  water, int units){
		this.name = name;
		this.code = code;
		this.water = water;
		this.units = units;
		
	}


//GETTERS & SETTERS
	public String getName(){
		return name;
	}

	public String getCode(){
		return code;
	}

	public double getWater(){
		return water;
	}

	public int getUnits(){
		return units;
	}

	


	public void setName(String name){
		this.name = name;
	}

	public void setCode(String code){
		this.code = code;
	}

	public void setWater(double water){
		this.water = water;
	}

	public void setUnits(int units){
		this.units = units;
	}

	


//toString PRODUCT INFORMATION
	public String toString(){
		String msg = "";
		
		msg += "========= INFO PRODUCTO =========\n";
		msg += "=================================\n";
		msg += "NOMBRE: " + name + "\n";
		msg += "CODIGO: " + code + "\n";
		msg += "UNIDADES: " + units + "\n";
		msg += "=================================\n";
		
		return msg;
	}
}