class Main{
	public static void main(String[] args){
		Manager m1 = new Manager("Rohit Kushwaha", 423, 1000000, 10);
		
		Developer d1 = new Developer("Kushagra Sharma", 564, 80000, "Java");
		
		Intern in1 = new Intern("Naman Agarwal", 983, 600000, 12);
		
		m1.displayDetails();
		d1.displayDetails();
		in1.displayDetails();
	
	}
}