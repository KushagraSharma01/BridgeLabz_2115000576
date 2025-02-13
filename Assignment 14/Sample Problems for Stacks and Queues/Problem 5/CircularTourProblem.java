import java.util.*;

class CircularTourProblem{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] pumps = new int[n];
		int[] distance = new int[n];
		
		System.out.println("Enter the values of pumps");
		for(int i=0;i<n;i++)
			pumps[i] = sc.nextInt();
			
		System.out.println("Enter the values of distances");
		for(int i=0;i<n;i++)
			distance[i] = sc.nextInt();
		
			
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0;i<n;i++)
			q.add(i);
			
		boolean found = false; 
		do{
			int sum = 0;
			int c = 0;
			int in = q.peek();
			System.out.println(in);
			while(c<n){
					
				if(c != 0)
					sum -= distance[in];
				if(sum < 0)
					break;
				sum += pumps[in];
				
				c++;
				in = (in+1)%n;
			}
			
			if(c == n){
				System.out.println("Starting point is petrol pump : "+(in+1));
				found = true;
				break;
			}
			
			int x = q.poll();
			q.add(x);
		}while(q.peek() != 0);
			
		if(!found)
			System.out.println("Cannot find the Pump to complete the tour");
	
	}


}