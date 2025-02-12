class Main{

	public static void main(String[] args){
		
		Undo_RedoTextEditor dl1 = new Undo_RedoTextEditor(3);
		
		dl1.add("Hello");
		dl1.add("My name is");
		dl1.add("Kushagra Sharma.");
		dl1.add("How are you");
		dl1.add("Doing?");
		
		dl1.displayAll();
		
		dl1.undo();
		dl1.undo();
		dl1.undo();
		
		dl1.displayAll();
		
		dl1.redo();
		
		dl1.displayAll();
		
		dl1.undo();
		
		dl1.add("Naman Agarwal");
		
		dl1.displayAll();
	}

}