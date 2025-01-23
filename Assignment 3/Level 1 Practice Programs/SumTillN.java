import java.util.*;
class SumTillN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>=0){
			int result1 = (number*(number+1))/2;
			int result2 = 0;
			while(number>0){
				result2 += number;
				number--;
			}
			if(result1 == result2){
					System.out.println(result1);
			}
		}
		else
			System.out.println("Not a Natural Number");
		 
	}
}