class Main{
	public static void main(String[] args){
		Company c1 = new Company("CapGemini");
		
		c1.addDepartment("Software Developer");
		c1.addDepartment("Testing");
		c1.addDepartment("Fullstack Developer");
		
		c1.addEmployee("Kushagra Sharma", 6758, "Software Developer");
		c1.addEmployee("Naman Agarwal", 5739, "Fullstack Developer");
		c1.addEmployee("Vedansh Gautam", 4857, "Testing");
		c1.addEmployee("Nikhil Agrawal", 8739, "Testing");
		
		c1.showAllDepartments();
		c1.showAllEmployees();
		
	}

}