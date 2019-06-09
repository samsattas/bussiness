package model;

public class Survey{
//ATTRIBUTES
	private int service;
	private int answerTime;
	private int costBenefit;

//CONSTRUCTOR
	public Survey(int service, int answerTime, int costBenefit){
		this.service =service;
		this.answerTime = answerTime;
		this.costBenefit = costBenefit;
	}

//GETTERS & SETTERS
	public int getService(){
		return service;
	}

	public int getAnswerTime(){
		return answerTime;
	}

	public int getCostBenefit(){
		return costBenefit;
	}


	public void setService(int service){
		this.service = service;
	}

	public void setAnswerTime(int answerTime){
		this.answerTime = answerTime;
	}

	public void setCostBenefit(int costBenefit){
		this.costBenefit = costBenefit;
	}

//METHODS
	public String toString(){
		String msg = "";

		msg += "=========== INFO ENCUESTA ===========\n";
		msg += "=====================================\n";
		msg += "SERVICIO: " + getService() + "/5\n";
		msg += "TIEMPO DE RESPUESTA: " + getAnswerTime() + "/5\n";
		msg += "COSTO/BENEFICIO: " + getCostBenefit() + "/5\n";
		msg += "=====================================\n";

		return msg;
	}
}