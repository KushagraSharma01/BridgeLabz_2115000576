class Thermostat extends Device{
	int temperatureSetting;
	
	Thermostat(int temperatureSetting, int deviceId, String status){
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	
	}
	
	public void displayInfo(){
		System.out.println("Thermostat temperature is : "+this.temperatureSetting);
		System.out.println("Thermostat device Id is : "+super.deviceId);
		System.out.println("Thermostat status : "+super.status);
	
	}

}