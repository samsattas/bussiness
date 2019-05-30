package model;

public abstract class Company{
public static String[] organizationType = {"AGRICULTURA, CAZA, SILVICULTURA Y PEZCA", "EXPLOTACION DE MINAS Y CANTERAS", "INDUSTRIA MANUFACTURERA", "ELECTRICIDAD, GAS Y VAPOR", "CONSTRUCCION", "COMERCIO AL POR MAYOR Y AL POR MENOR", "TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES", "EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS", "COMUNALES, SOCIALES"};

	private String name;
	private int nit;
	private String adress;
	private int phoneNumber;
	private int numberOfEmloyees;
	private double actives;
	private Date constitutionDate;
	private String type;
	private String agentName;

}