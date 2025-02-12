class Main{
	
	public static void main(String[] args){
			StudentRecordManagement l1 = new StudentRecordManagement();
			
			l1.addLast(10, "Kushagra Sharma", 21, "A");
			l1.addLast(13, "Naman Agarwal", 22, "B+");
			l1.addLast(16, "Nikhil Agrawal", 21, "A+");
			l1.addLast(25, "Vedansh Gautam", 20, "C");
			
			l1.addFirst(5, "Anik Roy", 21, "O");
			
			l1.addAt(8, "Kushagra Gupta", 20, "C+", 2);
			
			l1.displayAll();
			
			l1.search(13);
			
			l1.updateGrade(25, "C+");
			
			l1.displayAll();
			
			l1.delete(16);
			
			l1.displayAll();
	}

}