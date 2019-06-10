package model;
import java.util.ArrayList;

public class Manufacture extends Company{
//ATTRIBUTES
	private ArrayList<Product> products;

//CONSTRUCTOR
	public Manufacture(String name, int nit, String adress, int phoneNumber, int numberOfEmloyees, double actives, Date constitutionDate, String type, String agentName){
		super(name, nit, adress, phoneNumber, numberOfEmloyees, actives, constitutionDate, type, agentName);
		products = new ArrayList<Product>();
	}

//GETTERS & SETTERS
	public ArrayList<Product> getProducts(){
		return products;
	}

	public void setProducts(ArrayList<Product> products){
		this.products = products;
	}
	
//METHODS
	public String getInfo(){
		String msg = "";
		for(int i = 0 ; i < products.size();i++){
			msg += products.get(i).toString();
		}
		return msg;
	}
}