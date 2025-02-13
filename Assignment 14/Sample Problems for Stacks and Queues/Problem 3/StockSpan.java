//stack span
import java.util.*;

class StockSpan{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int prices[] = new int[n];
		
		for(int i=0;i<prices.length;i++){
			prices[i] = sc.nextInt();
		}
		
		int ans[] = new int[n];
		
		span(prices, ans);
		
		for(int i=0;i<ans.length;i++){
			System.out.println("Stock span for stock of price "+prices[i]+" is "+ans[i]+" days");
		}
	
	}
	
	public static void span(int[] prices, int[] ans){
		
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<prices.length;i++){
			
			while(!st.isEmpty() && prices[st.peek()] >= prices[i])
				st.pop();
				
			if(!st.isEmpty())
				ans[i] = i - st.peek();
			else
				ans[i] = i+1;
				
			st.push(i);
		}
		
	
	}
	
}
