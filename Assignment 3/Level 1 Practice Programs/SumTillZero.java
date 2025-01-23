import java.util.*;
class SumTillZero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double total = 0.0d;
		double uservalue = sc.nextDouble();
		while(uservalue != 0){
			total += uservalue;
			uservalue = sc.nextDouble();
		}
		System.out.println("the total value is "+total);
	}
}