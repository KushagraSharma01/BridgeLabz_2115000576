class Main{
	
	public static void main(String[] args){
			InventoryManagementSystem l1 = new InventoryManagementSystem();
			
			l1.addLast(10, "Maggi", 21, 230);
			l1.addLast(13, "Detergent", 22, 291);
			l1.addLast(16, "Football", 21, 932);
			l1.addLast(25, "Controller", 20, 500);
			
			l1.displayAll();
			
			l1.addFirst(5, "Zebronics Keyboard", 21, 1000);
			
			l1.addAt(8, "Horsh Shoe", 20, 300, 2);
			
			l1.displayAll();
			
			l1.search(13);
			
			l1.updateQuantity(25, 15);
			
			l1.displayAll();
			
			l1.delete(16);
			
			l1.displayAll();
			
			l1.sortName();
			
			l1.displayAll();
			
	}

}