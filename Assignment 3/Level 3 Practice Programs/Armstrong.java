import java.util.*;
class Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int originalNumber = number;
		while(originalNumber > 0){
			int remainder = originalNumber%10;
			sum += (remainder*remainder*remainder);
			originalNumber = originalNumber/10;
		}
		if(sum == number)
			System.out.println("The Number is Armstrong");
		else
			System.out.println("The Number is not Armstrong");
	}
}