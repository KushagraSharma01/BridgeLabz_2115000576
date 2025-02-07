class Main{
	public static void main(String[] args){
		Thermostat th1 = new Thermostat(100, 5467, "Working fine");
		Thermostat th2 = new Thermostat(58, 6740, "Does not work on humid days");
		
		th1.displayInfo();
		th2.displayInfo();
	
	}

}