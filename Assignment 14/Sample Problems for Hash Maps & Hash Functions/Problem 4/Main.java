class Main{

	public static void main(String[] args){
	
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		hm.put(2,3);
		hm.put(2,4);
		
		hm.put(4,5);
		hm.put(3,7);
		hm.put(9,1);
		
		
		hm.get(2);
		hm.get(9);
		hm.get(4);
		
		hm.remove(2);
		hm.get(2);
	
	}

}