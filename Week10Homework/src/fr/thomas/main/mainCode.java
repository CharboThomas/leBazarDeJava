package fr.thomas.main;

public class mainCode {
	
	public static void main(String[] args) {
		
		// I call the mother class
		//student PNJ1 = new student("Berges","Paul");

		System.out.println("Input = string");
		id myFirstId = new id("250");
		myFirstId.print();
		
		System.out.println("Input = int");
		id mySecondId = new id(250);
		mySecondId.print();
	}
}



class student{
	
	public String nom,prenom,group;
	
	public student(String nom, String prenom) {
		this(nom,prenom,"");
	}
	
	public student(String nom) {
		this(nom,"","");
	}
	
	public student(String nom,String prenom, String group) {
		// this method add data to my object
		this.nom = nom;
		this.prenom = prenom;
		this.group = group;
	}
	
}


class studentV2{
	
	private String nom,prenom,group;
	
	public studentV2(String nom,String prenom, String group) {
		// this method add data to my object
		this.nom = nom;
		this.prenom = prenom;
		this.group = group;
	}
	
	public void update(String nom,String prenom, String group){
		// this method add data to my object
		this.nom = nom;
		this.prenom = prenom;
		this.group = group;
	}
	
}


class id {
	
	private Number id;
	
	id(String strId){
		this( new StringAsInteger(strId).intValue() );
	}
	
	id(int inputId ){
		this.id = inputId;
	}
	
	// good manipulators
	void print() {
		System.out.println(this.id);
	}
	
	// bad manipulators
	Number printV2() {
		this.print();
		return(this.id)
	}
}


class StringAsInteger{
	private String src;
	
	StringAsInteger(String inputSrc){
		this.src = inputSrc;
	}
	
	int intValue() {
		return Integer.parseInt(this.src);
	}
}


class soldat{
	
	private String family_name, first_name, rank, section;
	
	soldat (String int_family_name, String int_first_name,String int_rank,String int_section){
		this.family_name = int_family_name;
		this.first_name = int_first_name;
		this.rank = int_rank;
		this.section = int_section;
	}	
}