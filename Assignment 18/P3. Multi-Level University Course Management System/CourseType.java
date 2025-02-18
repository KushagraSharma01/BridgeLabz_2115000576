abstract class CourseType{
	
	String name;
	int duration;
	
	CourseType(String name, int duration){
		
		this.name = name;
		this.duration = duration;
	
	}
	
	public abstract void displayDetails();
	

}