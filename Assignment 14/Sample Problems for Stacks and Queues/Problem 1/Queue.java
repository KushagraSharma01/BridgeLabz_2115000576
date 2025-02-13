import java.util.*;

class Queue{
	
	Stack<Integer> st1;
	Stack<Integer> st2;
	int size = 0;
	
	Queue(){
	
	
		this.st1 = new Stack<>();
		this.st2 = new Stack<>();
	}
	
	public void enqueue(int ele){
		
		st1.push(ele);
		size++;
		
		System.out.println("Element has been added to the Queue");
	
	}
	
	public int dequeue(){
		
		if(size == 0){
			System.out.println("Cannot remove anymore elements Queue is empty");
			return -1;
		}
	
		int ele = -1;
		
		while(!st1.isEmpty()){
			
			ele = st1.pop();
			if(st1.isEmpty())
				break;
			
			st2.push(ele);
		}
		
		while(!st2.isEmpty()){
			st1.push(st2.pop());
		}
		
		size--;
		
		return ele;
		
	}

}