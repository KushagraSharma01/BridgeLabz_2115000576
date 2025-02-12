class Main{
	
	public static void main(String[] args){
		LibraryManagementSystem dl1 = new LibraryManagementSystem();
		
		dl1.addLast("Arthashastra", "Kautilya", "politics", 324);
		dl1.addLast("Geeta Rahasya", "Bal Gangadhar", "Life Lessons", 542);
		dl1.addLast("Alice in Wonderland", "Lewis Carroll", "Fairy Tale", 165);
		dl1.addLast("Pride and Prejudice", "Jane Austen", "Love Story", 447);
		
		dl1.displayAll();
		
		dl1.addFirst("Frankenstein", "Mary Sheley", "Tragedy", 113);
		
		dl1.displayAll();
		
		dl1.search("Geeta Rahasya");
		
		dl1.search("Jane Austen");
		
		dl1.delete(165);
		
		dl1.updateAvailability("Frankenstein", false);
		
		dl1.displayAll();
		
		dl1.addAt("Don Quixote", "Miguel de Cervantes", "Suspense Thriller", 876, 4);
		
		dl1.displayAll();
		
		dl1.displayAllReverse();
		
		dl1.countBooks();
		
	} 

}