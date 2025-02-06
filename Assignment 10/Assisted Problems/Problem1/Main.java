class Main{
	public static void main(String[] args){
		Library lib1 = new Library("Gurukul");
		
		Book b1 = new Book("Harry Potter", "J.K Rowling");
		Book b2 = new Book("Lord of the Rings", "John Ronald");
		Book b3 = new Book("A Beautiful Mind", "John Forbes Nash");
		
		lib1.addBook(b1);
		lib1.addBook(b2);
		lib1.addBook(b3);
		
		lib1.displayBooks();
		lib1.displayDetails();
	}

}