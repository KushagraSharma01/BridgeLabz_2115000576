class Employee{
	String name;
	int id;
	int salary;

	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails(){
		System.out.println("Employee Name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee salary :"+salary);
	}
}