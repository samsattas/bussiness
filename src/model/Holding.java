package model;
import java.util.ArrayList;

public class Holding{
//ATTRIBUTES
	private String name;
	private String owner;

	private ArrayList<Company> companies;

//CONSTRUCTOR
	public Holding(String name, String owner){
		this.name = name;
		this.owner = owner;
		companies = new ArrayList<Company>();
	}

//GETTERS & SETTERS
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}


	public String getOwner(){
		return owner;
	}

	public void setOwner(String owner){
		this.owner = owner;
	}


//METHODS
	public int companyCount(int select){
		int count = 0;
		if(select == 0){
			many = companies.size();
		}
		return count;
	}


	public String showInfoCompany(){
		String msg = "";
		for(int i = 0; i < companies.size(); i++){
			msj += companies.get(i).toString();
		}
	}


}