import java.util.*;
class SpringSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		if((day >= 20 && month == 3)||(day <=20 && month == 6) ||(month>3 && month<6))
			System.out.println("Its a Spring Season");
		else
			System.out.println("Not a Spring Season");
	}

}