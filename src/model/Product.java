package model;

public class Product{
//ATTRIBUTES
	private String name;
	private String code;
	private double water;
	private int units;
	private Invima invima;


//CONSTRUCTOR
	public Product(String name, String code, double  water, int units, Invima invima){
		this.name = name;
		this.code = code;
		this.water = water;
		this.units = units;
		this.invima = invima;
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

	public Invima getInvima(){
		return invima;
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

	public void setInvima(Invima invima){
		this.invima = invima;
	}
}