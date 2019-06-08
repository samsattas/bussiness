package model;

public class MedCompany{
//STATICS
	public static final String FE = "fabricar y exportar";
	public static final String FV = "fabricar y vender";
	public static final String IV = "importar y vender";

//ATTRIBUTES
	private String sanitary;
	private boolean status;
	private Date expiration;
	private String modality;

//CONSTRUCTOR
	public MedCompany(String sanitary, boolean status, Date expiration, String modality){
		this.sanitary = sanitary;
		this.status = status;
		this.expiration = expiration;
		this.modality = modality;
	}

//GETTERS & SETTERS
	public String getSanitary(){
		return sanitary;
	}

	public boolean getStatus(){
		return status;
	}

	public Date getExpiration(){
		return expiration;
	}

	public String getModality(){
		return modality;
	}


	public void setSanitary(String sanitary){
		this.sanitary = sanitary;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public void setExpiration(Date expiration){
		this.expiration = expiration;
	}

	public void setModality(String modality){
		this.modality = modality;
	}


	public String toString(){
		String msg = "";

		msg += "======== INFO MEDICAMENTO ========";
		msg += "==================================";
		msg += "REGISTRO SANITARIO: " + sanitary;
		msg += "ESTADO: " + status;
		msg += "VENCIMIENTO: " + expiration;
		msg += "MODALIDAD: " + modality;
		msg += "==================================";
	}


}