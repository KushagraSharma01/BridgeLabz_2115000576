class Main{
	
	public static void main(String[] args){
		TaskSchedular cl1 = new TaskSchedular();
		
		cl1.addLast(5, "Gym", 4, "12-02-2025");
		cl1.addLast(10, "BreakFast", 3, "11-02-2025");
		cl1.addLast(15, "Visit Grandma", 6, "20-02-2025");
		cl1.addLast(19, "Get Groceries", 2, "13-02-2025");
		
		cl1.displayAll();
		
		cl1.addFirst(2, "Go to College", 1, "12-02-2025");
		
		cl1.displayAll();
		
		cl1.search(1);
		
		cl1.delete(15);
		
		cl1.displayAll();
		
		cl1.addAt(4, "Go to Washroom", 5, "11-02-2025", 2);
		
		cl1.displayAll();
		
	}


}