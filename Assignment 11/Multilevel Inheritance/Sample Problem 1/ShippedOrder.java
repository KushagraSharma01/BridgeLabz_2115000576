class ShippedOrder extends Order{
	int trackingNumber;
	
	ShippedOrder(int orderId, String orderDate, int trackingNumber){
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}

	public void getOrderStatus(){
		System.out.println("Shipped Order id is : "+orderId);
		System.out.println("Shipped Order date is : "+orderDate);
		System.out.println("Shipped Order tracking number is : "+this.trackingNumber);
	}
}