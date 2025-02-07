class Vehicle{
	int maxSpeed;
	String fuelType;
	
	Vehicle(int maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void displayInfo(){
		System.out.println("Max Speed for this vehicle is : "+maxSpeed+" kmp");
		System.out.println("Fuel type for this vehicle is : "+fuelType);
	}

}