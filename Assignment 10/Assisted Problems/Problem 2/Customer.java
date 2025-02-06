import java.util.*;
class Customer{
	String name;
	List<BankAccount> bankAccounts;
	
	Customer(String name){
		this.name = name;
		bankAccounts = new ArrayList<>();
	}

	public void viewBalance(int pin){
		boolean f = false;
		for(int i=0;i<bankAccounts.size();i++){
			if(pin == bankAccounts.get(i).pin){
				System.out.println("Balance for this Bank Account is : "+bankAccounts.get(i).balance);
				f = true;
				break;
			}
		}
		if(bankAccounts.size() == 0)
			System.out.println("No Bank Account found for "+name+" in any bank with the given pin");
		else if(!f)
			System.out.println("No Bank Account found for given pin");
	}
}