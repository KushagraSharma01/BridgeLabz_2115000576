class AssignmentBased extends CourseType{

	AssignmentBased(String name, int duration){
		
		super(name, duration);
	
	}
	
	public void displayDetails(){
	
		System.out.println("Course name is : "+super.name);
		System.out.println("Course duration is : "+super.duration);
		System.out.println();
	}
}