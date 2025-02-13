import java.util.*;
class Main{

	public static void main(String[] args){
		
		Stack<Integer> st = new Stack<>();
		
		st.push(1);
		st.push(18);
		st.push(7);
		st.push(14);
		st.push(3);
		
		sort(st);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	
	}

	public static void sort(Stack<Integer> st){

		if(st.isEmpty())
			return;

		int x = st.pop();
		sort(st);
		insert(st, x);
	
	}
	
	public static void insert(Stack<Integer> st, int x){
		
		Stack<Integer> temp = new Stack<>();
		
		while(!st.isEmpty() && st.peek()<x){
				temp.push(st.pop());
		}
		
		st.push(x);
		
		while(!temp.isEmpty()){
			st.push(temp.pop());
		}
	
	}


}