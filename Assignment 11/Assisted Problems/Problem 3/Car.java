class Car extends Vehicle{
	int seatCapacity;

	Car(int maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	public void displayInfo(){
		System.out.println("Max Speed for this car is : "+super.maxSpeed+" kmp");
		System.out.println("Fuel type for this car is : "+super.fuelType);
		System.out.println("Seat Capacity for this car is : "+seatCapacity);
	}
}