import java.util.*;
class BankAccount{
	String owner;
	String bankName;
	int pin;
	int balance;
	
	BankAccount(String name,String bankName, int pin, int amount){
		this.owner = name;
		this.bankName = bankName;
		this.pin = pin;
		this.balance = amount;
	}
	
}