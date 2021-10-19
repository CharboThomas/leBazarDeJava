package fr.thomas.Main;

public class mainCode {
	
	static int gradeAverage(int x1, int y1, grade myGrade){
		return myGrade.average(x1,y1);
	};
	
	public static void main(String[] args) {
		
		// I call the mother class
		System.out.println("mother class: ");
		student PNJ1 = new student();
		PNJ1.addData("Berges","Paul","B");
		PNJ1.printData();
		
		
		// I call the daughter class
		System.out.println("daughter class: ");
		SET PNJ2 = new SET();
		PNJ2.addData("Charbonnet","Thomas","A");	
		PNJ2.printData();
		

		
		// Lambda code
		
		// I creat a new instruction for the method "gradeAverage"
	    grade truc = (int x, int y) -> x+y;
	    // I "change" the method called gradeAverage
	    int studentAverage = gradeAverage(8,4,truc);
	    // I print the result on the terminal
	    System.out.println(studentAverage);
	    
				
	}

}

// Mother Class

class student{
	
	public String nom,prenom,group;
	
	public void addData(String nom,String prenom, String group) {
		// this method add data to my object
		this.nom = nom;
		this.prenom = prenom;
		this.group = group;
	}
	
	public void printData() {
		// this method print data
		System.out.println("Nom => " + this.nom);
		System.out.println("Prenom => " + this.prenom);
		System.out.println("Group => " + this.group);
		// i print the major of the student
		this.printMajor();
	};
	
	public void printMajor() {
		// this method print the major of the student
		System.out.println("Major => Ingeneer \n");
	};
	
}



// Daughter Class : SET

class SET extends student{
	
	// I update the method called printMajor
	public void printMajor() {
		// this method print a new text
		System.out.println("Major => Telecom \n");
	};
	
}