class Main{
	public static void main(String[] args){
		University un1 = new University("GLA UNIVERSITY");
		
		Faculty f1 = new Faculty("Shardul Sir", "Java Fullstack");
		Faculty f2 = new Faculty("Ashutosh Sir", ".Net");
		Faculty f3 = new Faculty("Krutika Ma'am", "Artificial Intelligence");
		
		un1.addDepartment("Java Fullstack");
		un1.addDepartment(".Net");
		un1.addDepartment("Artificial Intelligence");
		
		un1.addFaculty(f1);
		un1.addFaculty(f2);
		un1.addFaculty(f3);
		
		un1.showAllFaculties();
		un1.showAllDepartments();
	
	}

}