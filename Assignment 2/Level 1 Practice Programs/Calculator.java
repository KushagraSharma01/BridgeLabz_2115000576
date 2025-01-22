import java.util.*;
class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double val1 = sc.nextDouble();
		double val2 = sc.nextDouble();
		//performing arithmetic operations
		double add = val1+val2;
		double sub = val1-val2;
		double mul = val1*val2;
		double div = val1/val2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+val1+" and "+val2+" is "+add+", "+sub+", "+mul+", and "+div);
	
	}

}