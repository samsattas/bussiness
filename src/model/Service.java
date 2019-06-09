package model;
import java.util.ArrayList;

public class Service extends Company{
	
	private ArrayList<Survey> surveys;

	public Service(String name, int nit, String adress, int phoneNumber, int numberOfEmloyees, double actives, Date constitutionDate, String type, String agentName){
		super(name, nit, adress, phoneNumber, numberOfEmloyees, actives, constitutionDate, type, agentName);
		surveys = new ArrayList<Survey>();
	}


	public ArrayList<Survey> getSurveys(){
	  return surveys;
	}

	public void setSurveys(ArrayList<Survey> surveys){
	  this.surveys = surveys;
	}

	public void addSurveys(ArrayList<Survey> client){
	  surveys = client;
	}

	public String getInfor(){
		String msg = "";
		for(int i = 0 ; i < surveys.size();i++){
			msg += surveys.get(i).toString();
		}
		return msg;
	}

}