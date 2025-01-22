import java.util.*;
class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Assuming input to be in cm
		double baseInCm = sc.nextDouble();
		double heightInCm = sc.nextDouble();
		//converting cm to inches
		double baseInInches = baseInCm/2.54;
		double heightInInches = heightInCm/2.54;
		//calculating area
		double areaInCm = 0.5*baseInCm*heightInCm;
		double areaInInches = 0.5*baseInInches*heightInInches;
		//printing result
		System.out.println("Area of Triangle in square cm is "+areaInCm+" and in square inches is "+areaInInches);
	}
}