class Main{
	public static void main(String[] args){
		Customer c1 = new Customer("Kushagra Sharma");
		Customer c2 = new Customer("Naman Agarwal");
		
		Bank b1 = new Bank("SBI");
		
		b1.openAccount(c1, 5467, 50000);
		b1.openAccount(c1, 4534, 25000);
		
		b1.openAccount(c2, 5647, 30000);
		b1.openAccount(c2, 7857, 25000);
		
		c1.viewBalance(5467);
		c1.viewBalance(4534);
		
		c2.viewBalance(5647);
		c2.viewBalance(7857);
	
	}


}