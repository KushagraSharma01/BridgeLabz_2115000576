class Order{
	int orderId;
	String orderDate;
	
	Order(int orderId, String orderDate){
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	public void getOrderStatus(){
		System.out.println("Order id is : "+orderId);
		System.out.println("Order date is : "+orderDate);
	}
}