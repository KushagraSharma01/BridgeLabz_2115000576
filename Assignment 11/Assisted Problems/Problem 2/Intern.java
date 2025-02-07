class Intern extends Employee{
	int duration;
	
	Intern(String name, int id, int salary, int duration){
		super(name, id, salary);
		this.duration = duration;
	}
	
	public void displayDetails(){
		System.out.println("Intern Name : "+super.name);
		System.out.println("Intern id : "+super.id);
		System.out.println("Intern salary :"+super.salary);
		System.out.println("Intern work duration :"+this.duration);
	}

}