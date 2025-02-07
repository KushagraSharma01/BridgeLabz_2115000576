class Main{
	public static void main(String[] args){
		OnlineCourse oc1 = new OnlineCourse("Maths", "2 hrs", "BridgeLabs", true);
		
		PaidOnlineCourse poc1 = new PaidOnlineCourse("Data Structures", "3hrs", "Udemy", true, 2000, 500);
		
		oc1.displayDetails();
		poc1.displayDetails();
	}

}