class Main{
	
	public static void main(String[] args){
		MovieManagementSystem dl1 = new MovieManagementSystem();
		
		dl1.addLast("Once Upon a Time... in Hollywood", "Quentin Tarantino", 2019, 7.6);
		dl1.addLast("The Trauma Code: Heroes on Call", "Lee Do-yoon", 2025, 8.5);
		dl1.addLast("Black Swan", "Darren Afronofsky", 2010, 8.0);
		dl1.addLast("The Martian", "Ridley Scott", 2015, 8.0);
		
		dl1.displayAll();
		
		dl1.addFirst("Black Panther : Wakanda Forever", "Ryan Coogler", 2022, 6.7);
		
		dl1.displayAll();
		
		dl1.search("Darren Afronofsky");
		
		dl1.search(8.0);
		
		dl1.delete("Black Swan");
		
		dl1.updateRating("The Martian", 8.5);
		
		dl1.displayAll();
		
		dl1.addAt("Jaani Dushman", "Ritik Tyagi", 2015, 4.5, 4);
		
		dl1.displayAll();
		
		dl1.displayAllReverse();
		
	} 

}