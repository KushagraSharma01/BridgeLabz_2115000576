import java.util.*;
class FizzBuzz2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i = 0;
		while(i<=number){
			if(i%3 ==0 && i%5 != 0)
				System.out.println("Fizz");
			else if(i%5 == 0 && i%3 != 0)
				System.out.println("Buzz");
			else if(i%5 ==0 && i%3 ==0)	
				System.out.println("FizzBuzz");
			else
				System.out.println(i);
			i++;
		}
	}
}