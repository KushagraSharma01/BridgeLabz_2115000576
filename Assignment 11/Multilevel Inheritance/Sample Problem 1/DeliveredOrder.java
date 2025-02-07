class DeliveredOrder extends ShippedOrder{
	String deliveryDate;

	DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate){
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}

	public void getOrderStatus(){
		System.out.println("Deleivered Order id is : "+orderId);
		System.out.println("Delivered Order date is : "+orderDate);
		System.out.println("Delivered Order tracking number is : "+trackingNumber);
		System.out.println("Delivered Order deliveryDate is : "+this.deliveryDate);
	}
	
}