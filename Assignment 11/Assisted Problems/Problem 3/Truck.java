class Truck extends Vehicle{
	int loadCapacity;

	Truck(int maxSpeed, String fuelType, int loadCapacity){
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	public void displayInfo(){
		System.out.println("Max Speed for this truck is : "+super.maxSpeed+" kmp");
		System.out.println("Fuel type for this truck is : "+super.fuelType);
		System.out.println("Load Capacity for this truck is : "+loadCapacity+" kgs");
	}
}