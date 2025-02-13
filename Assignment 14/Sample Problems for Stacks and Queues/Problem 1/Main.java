class Main{

	public static void main(String[] args){
		
		Queue q1 = new Queue();
	
		q1.enqueue(12);
		q1.enqueue(14);
		q1.enqueue(15);
		q1.enqueue(18);
		q1.enqueue(23);
		q1.enqueue(27);
		
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
	
	}

}