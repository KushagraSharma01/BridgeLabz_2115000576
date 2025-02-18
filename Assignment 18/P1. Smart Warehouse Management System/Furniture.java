class Furniture extends WarehouseItem{


	Furniture(String name, int price, int quantity){
	
		super(name, price, quantity);
	
	}
	
	public void showDetails(){
	
		System.out.println("Name of the Furniture Item is "+this.name);
		System.out.println("Price of the Furniture Item is "+this.price);
		System.out.println("Quantity of the Furniture Item is "+this.quantity);
	
	}
	
}