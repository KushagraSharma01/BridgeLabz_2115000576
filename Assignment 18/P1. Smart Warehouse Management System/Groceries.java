class Groceries extends WarehouseItem{

	Groceries(String name, int price, int quantity){
		super(name, price, quantity);
	
	}
	
	public void showDetails(){
	
		System.out.println("Name of the Groceries Item is "+this.name);
		System.out.println("Price of the Groceries Item is "+this.price);
		System.out.println("Quantity of the Groceries Item is "+this.quantity);
	
	}
	
}