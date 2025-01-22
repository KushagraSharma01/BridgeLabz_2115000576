import java.util.*;
class Discount2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double fee = sc.nextDouble();
		double discountPercent = sc.nextDouble();
		//calculating discounted amount
		double discountAmount = (discountPercent/100)*fee;
		//calculating discounted price
		double discountPrice = fee - discountAmount;
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountPrice);
	}
}