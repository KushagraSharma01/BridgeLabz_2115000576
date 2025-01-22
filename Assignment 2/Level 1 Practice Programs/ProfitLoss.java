class ProfitLoss{
	public static void main(String[] args){
		double cp = 129, sp = 191;
		double pr = sp - cp;
		double prPer = (pr/cp)*100;
		System.out.print("The Cost Price is INR "+ cp +" and Selling Price is INR "+sp+" \nThe Profit is INR "+pr+" and the Profit Percentage is "+prPer);
	}
}