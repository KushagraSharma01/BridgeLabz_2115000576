class PaidOnlineCourse extends OnlineCourse{
	int fee;
	int discount;
	
	PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, int fee, int discount){
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	
	public void displayDetails(){
		System.out.println("Paid Online Course name is : "+courseName);
		System.out.println("Paid Online Course duration is : "+duration);
		System.out.println("Platform for this paid online course is :"+platform);
		System.out.println("This paid Online course is Recorded or Not : "+isRecorded);
		System.out.println("The fee for this paid online course is : "+fee);
		System.out.println("The discount on this paid online course is : "+discount);
	}
}