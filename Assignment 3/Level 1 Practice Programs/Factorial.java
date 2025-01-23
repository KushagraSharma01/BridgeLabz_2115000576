import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = 1;
		if(number > 0){
			while(number > 0){
				factorial = factorial*number;
				number--;
			}
			System.out.println("Factorial is : "+factorial);
		}
		else
			System.out.println("Number is not positive");
	}
}