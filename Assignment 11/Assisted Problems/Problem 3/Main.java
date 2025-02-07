class Main{
	public static void main(String[] args){
		Car c1 = new Car(200, "petrol", 4);
		Car c2 = new Car(350, "diesel", 2);
		
		Motorcycle m1 = new Motorcycle(120, "petrol", 1200);
		
		Truck t1 = new Truck(170, "diesel", 1200);
		
		c1.displayInfo();
		c2.displayInfo();
		m1.displayInfo();
		t1.displayInfo();
	}
	
}