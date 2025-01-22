class VolumeOfEarth{
	public static void main(String[] args){
		//radius in km 
		double rKm = 6378;
		//volume in kilometer cube 
		double vInKm = ((double)4/3)*(3.14)*rKm*rKm*rKm;
		//radius in miles
		double rM = rKm/1.6;
		//volume in miles cube
		double vInMiles = ((double)4/3)*(3.14)*rM*rM*rM;
		System.out.println("The volume of earth in cubic kilometers is "+vInKm+" and cubic miles is "+vInMiles);
	}
}