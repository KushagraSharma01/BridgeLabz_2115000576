class Manager extends Employee{
	int teamSize;

	Manager(String name, int id, int salary, int teamSize){
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	public void displayDetails(){
		System.out.println("Manager Name : "+super.name);
		System.out.println("Manager id : "+super.id);
		System.out.println("Manager salary :"+super.salary);
		System.out.println("Manager team size :"+this.teamSize);
	}

}