import java.util.*;

class LongestConsecutiveSequence{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int max = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<n;i++){
			
			int inc = 1;
			int dec = 1;
			
			while(hm.containsKey(arr[i]+inc))
				inc++;
			while(hm.containsKey(arr[i]-dec))
				dec++;
			
			max = Math.max(max, inc+dec-1);
			
			hm.put(arr[i], i);
		
		}
		System.out.println("Longest Consecutive Subsequence length is : "+max);
	}

}