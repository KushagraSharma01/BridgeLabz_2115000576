import java.util.*;
class Bank{
	String name;
	List<Customer> customers;

	Bank(String name){
		this.name = name;
		customers = new ArrayList<>();
	}
	
	public void openAccount(Customer c1, int pin, int amount){
		BankAccount bA = new BankAccount(c1.name,name, pin, amount);
		c1.bankAccounts.add(bA);
		boolean f = true;
		for(int i=0;i<customers.size();i++){
			if(c1 == customers.get(i)){
				f = false;
				break;
			}
		}
		if(f)
			customers.add(c1);
		System.out.println("New Bank Account created for customer "+c1.name+" in bank "+name);
	}
}