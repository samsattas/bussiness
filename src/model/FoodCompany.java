package model;

public class FoodCompany{
	public final static String AM = "Temperatura ambiente";
	public final static String RE = "Refrigerar";
	public final static String FR = "Congelar";

	private String producer;
	private String importer;
	private String refrigeration;

	public FoodCompany(String producer, String importer, String refrigeration){
		this.producer = producer;
		this.importer = importer;
		this.refrigeration = refrigeration;
	}

	public String getProducer(){
		return producer;
	}

	public String getImporter(){
		return importer;
	}

	public Strong getRefrigeration(){
		return refrigerationl;
	}


	public void setProducer(String producer){
		this.producer =producer;
	}

	public void setImporter(String importer){
		this.importer = importer;
	}

	public void setRefrigeration(String refrigeration){
		this.refrigeration = refrigeration;
	}


	public String toString(){
		String msg = "";

		msg += "================================\n";
		msg += "========= INFO COMIDA ==========\n";
		msg += "PRODUCTOR: " + getProducer() + "\n";
		msg += "IMPORTADOR: " + getImporter() + "\n";
		msg += "REFRIGERACION: " + getRefrigeration() + "\n";
		msg += "================================\n";
	}
}