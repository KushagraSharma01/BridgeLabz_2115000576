import java.util.*;
class Main{

	
	public static void main(String[] args){
		
		Groceries g1 = new Groceries("Cup Set", 1500, 200);
		Electronics e1 = new Electronics("Keyboard", 1000, 300);
		Furniture f1 = new Furniture("Sofa", 30000, 40);
		
		Groceries g2 = new Groceries("Cutlery", 1000, 300);
		Electronics e2 = new Electronics("Monitor", 15000, 50);
		Furniture f2 = new Furniture("Table", 20000, 50);
		
		//has to provide the type of the generic class
		Storage<Groceries> st1 = new Storage<>();
		Storage<Electronics> st2 = new Storage<>();
		Storage<Furniture> st3 = new Storage<>();
		
		st1.add(g1);
		st1.add(g2);
		
		st2.add(e1);
		st2.add(e2);
		
		st3.add(f1);
		st3.add(f2);
		
		displayAll(st1.items);
		displayAll(st2.items);
		displayAll(st3.items);
		
		
	
	}
	
	public static void displayAll(List<? extends WarehouseItem> l1){
		
		for(int i=0;i<l1.size();i++){
			l1.get(i).showDetails();
			System.out.println();
		}
	
	}


}