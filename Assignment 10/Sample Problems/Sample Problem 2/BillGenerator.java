import java.util.*;
class BillGenerator{
	Customer customer;
	
	BillGenerator(Customer customer){
		this.customer = customer;
	}
	
	public void generateBill(){
		int sum = 0;
		for(int i=0;i<customer.products.size();i++)
			sum += customer.products.get(i).price;
		System.out.println("Total for "+customer.name+" is : "+sum);
	}
}