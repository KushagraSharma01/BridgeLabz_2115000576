class Main{
	public static void main(String[] args){
		Book b1 = new Book("Ramayana", 400);
		
		Clothing c1 = new Clothing("T-shirt", 300);
		
		Gadgets g1 = new Gadgets("Keyboard", 1000);
		
		Product<Book> p1 = new Product<>(b1);
		Product<Clothing> p2 = new Product<>(c1);
		Product<Gadgets> p3 = new Product<>(g1);
		
		
		applyDiscount(p1, 5);
		applyDiscount(p2, 10);
		applyDiscount(p3, 15);
	}
	
	public static <T extends Product> void applyDiscount(T product, double percentage){
			
		if(product.instance instanceof Book){
			Book b1 = (Book)product.instance;
			System.out.println("Discount on "+(b1.name)+" is :"+((percentage/100)*(b1.price)));
		
		}
		if(product.instance instanceof Clothing){
			Clothing c1 = (Clothing)product.instance;
			System.out.println("Discount on "+(c1.name)+" is :"+((percentage/100)*((c1.price))));
		}
		if(product.instance instanceof Gadgets){
			Gadgets g1 = (Gadgets)product.instance;
			System.out.println("Discount on "+(g1.name)+" is :"+((percentage/100)*((g1.price))));
		}
			
		
	}
	
	


}