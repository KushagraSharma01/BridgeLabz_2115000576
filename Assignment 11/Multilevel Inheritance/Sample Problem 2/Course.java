class Course{
	String courseName;
	String duration;

	Course(String courseName, String duration){
		this.courseName = courseName;
		this.duration = duration;
	}
	
	public void displayDetails(){
		System.out.println("Course name is : "+courseName);
		System.out.println("Course duration is : "+duration);
	}
}