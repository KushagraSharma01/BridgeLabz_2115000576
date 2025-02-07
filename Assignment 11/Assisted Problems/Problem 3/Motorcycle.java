class Motorcycle extends Vehicle{
	int horsePower;

	Motorcycle(int maxSpeed, String fuelType, int horsePower){
		super(maxSpeed, fuelType);
		this.horsePower = horsePower;
	}
	
	public void displayInfo(){
		System.out.println("Max Speed for this bike is : "+super.maxSpeed +" kmp");
		System.out.println("Fuel type for this bike is : "+super.fuelType);
		System.out.println("Horse Power for this bike is : "+horsePower);
	}
}