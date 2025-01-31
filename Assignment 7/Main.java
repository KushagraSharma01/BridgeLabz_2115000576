class Main{
	public static void main(String[] args){
		Employee e1 = new Employee("Kushagra Sharma", 010, 7500000);
		e1.displayDetails();
		e1.setName("Vedansh Gautam");
		e1.displayDetails();
		System.out.println(e1.getId());
		
		Circle c1 = new Circle(4.53);
		c1.area();
		c1.circumference();
		c1.setRadius(3.24);
		System.out.println(c1.getRadius());
		
		Book b1 = new Book("Harry Potter", "J.K Rowling", 20000);
		b1.displayDetails();
		b1.setPrice(24000);
		System.out.println(b1.getPrice());
		b1.setAuthor("Kushagra Sharma");
		System.out.println(b1.getAuthor());
	}
}