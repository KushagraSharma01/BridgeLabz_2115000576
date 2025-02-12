class Main{
	
	public static void main(String[] args){
		RoundRobinSchedulingAlgorithm cl1 = new RoundRobinSchedulingAlgorithm();
		
		cl1.addLast(5, 14, 4);
		cl1.addLast(10, 11, 3);
		cl1.addLast(15, 5, 6);
		cl1.addLast(19, 10, 2);
		cl1.addLast(12, 4, 1);
		
		cl1.displayAll();
		
		cl1.delete(12);
		
		cl1.displayAll();
		
		cl1.simulateRoundRobin(2);
		
	}


}