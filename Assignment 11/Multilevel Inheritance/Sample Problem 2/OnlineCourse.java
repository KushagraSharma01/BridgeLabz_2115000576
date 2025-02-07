class OnlineCourse extends Course{
	String platform;
	boolean isRecorded;
	
	OnlineCourse(String courseName, String duration, String platform, boolean isRecorded){
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	public void displayDetails(){
		System.out.println("Online Course name is : "+courseName);
		System.out.println("Online Course duration is : "+duration);
		System.out.println("Platform for this online course is :"+platform);
		System.out.println("This Online course is Recorded or Not : "+isRecorded);
	}

}