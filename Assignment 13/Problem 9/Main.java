class Main{

	public static void main(String[] args){
		
		OnlineTicketReservationSystem cl1 = new OnlineTicketReservationSystem();
		
		cl1.addLast( "Kushagra Sharma", "Guide", "B25",3244, 12);
		cl1.addLast("Naman Agarwal", "Guide", "D03",5323, 12);
		cl1.addLast( "Nikhil Agrawal", "Krish 3", "A18", 8593,3);
		//cl1.addLast(0832, "Vedansh Gautam", "Fast And Furious", "C34", 6);
		cl1.addLast( "Rishank Mehrotra", "Black Panther", "D04",1236, 9);
		
		cl1.displayAll();
		
		cl1.calculateTotalTickets();
		
		cl1.delete(8593);
		
		cl1.calculateTotalTickets();
		
		cl1.displayAll();
		
		cl1.search("Guide");
	}

}