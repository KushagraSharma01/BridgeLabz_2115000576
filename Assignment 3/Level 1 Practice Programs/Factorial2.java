import java.util.*;
class Factorial2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = 1;
		if(number > 0){
			for(;number > 0;number--){
				factorial = factorial*number;
			}
			System.out.println("Factorial is : "+factorial);
		}
		else
			System.out.println("Number is not positive");
	}
}