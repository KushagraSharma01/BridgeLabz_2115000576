class Device{
	int deviceId;
	String status;

	Device(int deviceId, String status){
		this.deviceId = deviceId;
		this.status = status;
	}
	
	public void displayStatus(){
		System.out.println("Device Id is : "+deviceId);
		System.out.println("Deveice status is : "+status);
	}

}