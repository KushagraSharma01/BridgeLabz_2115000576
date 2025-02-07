class Developer extends Employee{
	String programmingLanguage;
	
	Developer(String name, int id, int salary, String programmingLanguage){
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	public void displayDetails(){
		System.out.println("Developer Name : "+super.name);
		System.out.println("Developer id : "+super.id);
		System.out.println("Developer salary : "+super.salary);
		System.out.println("Developer programming language :"+this.programmingLanguage);
	}

}