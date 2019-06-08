package model;


public class Cubicle{
//ATTRIBUTES
	public String name;
	public String position;
	public String email;
	public String extension;

//CONSTRUCTOR
	public Cubicle(){
		this.name = name;
		this.position = position;
		this.email = email;
		this.extension = extension;
	}

//GETTERS & SETTERS
	public String getName(){
		return name;
	}

	public String getPosition(){
		return position;
	}

	public String getEmail(){
		return email;
	}

	public String getExtension(){
		return extension;
	}


	public void setName(String name){
		this.name = name;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setExtension(String extension){
		this.extension = extension;
	}
}