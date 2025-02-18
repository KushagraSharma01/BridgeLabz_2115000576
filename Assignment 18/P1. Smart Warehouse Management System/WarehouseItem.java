abstract class WarehouseItem{

	String name;
	int price;
	int quantity;
	
	WarehouseItem(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public abstract void showDetails();


}