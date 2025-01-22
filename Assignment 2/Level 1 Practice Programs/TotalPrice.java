import java.util.*;
class TotalPrice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double unitPrice = sc.nextDouble();
		double quantity = sc.nextDouble();
		double totalPrice = unitPrice*quantity;
		System.out.println("The total purchase price in INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}