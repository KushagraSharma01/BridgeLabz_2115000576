import java.util.*;

class TwoSumProblem{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int target = sc.nextInt();
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		boolean found = false;
		
		for(int i=0;i<n;i++){
			if(hm.containsKey(target - arr[i])){
				System.out.println("Indices with the sum equal to given sum are : "+hm.get(target-arr[i])+" and "+i);
				found = true;
				break;
			}
			hm.put(arr[i], i);
		}
		
		if(!found)
			System.out.println("No indices found with sum equal to given sum");
	
	}


}