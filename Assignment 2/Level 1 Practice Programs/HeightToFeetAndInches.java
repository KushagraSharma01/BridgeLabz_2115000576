import java.util.*;
class HeightToFeetAndInches{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double heightInInches = height/2.54;
		double heightInFeets = heightInInches/12;
		System.out.println("Your Height in cm is "+height+" while in feet is "+heightInFeets+" and in inches is "+heightInInches);
	}
}