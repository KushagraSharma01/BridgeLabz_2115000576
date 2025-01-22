import java.util.*;
class FeetToMilesAndYards{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double distanceInFeet = sc.nextDouble();
		double distanceInYards = distanceInFeet/3;
		double distanceInMiles = distanceInYards/1760;
		System.out.println("The Distance in feets is "+distanceInFeet+" while in Yards is "+distanceInYards+" and in Miles is "+distanceInMiles);
	}
}