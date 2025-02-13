//sliding window maximum
import java.util.*;
class SlidingWindowMaximum{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
		int k = sc.nextInt();
		
		Deque<Integer> dq = new LinkedList<Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(!dq.isEmpty() && (i-dq.peek()) >= k )
				dq.poll();
				
			while(!dq.isEmpty() && arr[i] > arr[dq.peekLast()])
				dq.pollLast();
			
			dq.addLast(i);
			
			if(i >= k-1)
				System.out.println("Maximum in the window is : "+arr[dq.peek()]);
		}
		
	
	}

}