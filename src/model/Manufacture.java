package model;
import java.util.ArrayList;

public class Manufacture extends Company{
	private ArrayList<Product> products;

	public Manufacture(String name, int nit, String adress, int phoneNumber, int numberOfEmloyees, double actives, Date constitutionDate, String type, String agentName){
		super(name, nit, adress, phoneNumber, numberOfEmloyees, actives, constitutionDate, type, agentName);
		products = new ArrayList<Product>();
	}

	
	
}