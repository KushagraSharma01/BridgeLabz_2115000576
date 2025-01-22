class Discount{
	public static void main(String[] args){
		double fee = 125000, discount = 10;
		//calculating discounted amount
		double disAmount = (discount/100)*fee;
		//calculating discounted price
		double disPrice = fee - disamount;
		System.out.println("The discount amount is INR "+disAmount+" and final discounted fee is INR "+disPrice);
	}
}