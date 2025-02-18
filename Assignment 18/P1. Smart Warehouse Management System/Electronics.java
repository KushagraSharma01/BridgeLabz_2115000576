class Electronics extends WarehouseItem{

	Electronics(String name, int price, int quantity){
	
		super(name, price, quantity);
	
	}
	
	public void showDetails(){
	
		System.out.println("Name of the Electronics Item is "+this.name);
		System.out.println("Price of the Electronics Item is "+this.price);
		System.out.println("Quantity of the Electronics Item is "+this.quantity);
	
	}
	
}