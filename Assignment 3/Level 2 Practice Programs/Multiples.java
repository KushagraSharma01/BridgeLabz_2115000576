import java.util.*;
class Multiples{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=100;i>=1;i--){
			if(number%i == 0)
				System.out.println(i);
		}
	}
}