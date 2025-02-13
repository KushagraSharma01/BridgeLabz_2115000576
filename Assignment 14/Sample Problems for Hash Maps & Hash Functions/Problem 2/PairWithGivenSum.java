import java.util.*;

class PairWithGivenSum{
	
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
			if(i > 0 && hm.containsKey(target - arr[i])){
				System.out.println("Pair exists");
				found = true;
				break;
			}
				
			hm.put(arr[i], 0);
		}
		if(!found)
			System.out.println("Pair not found");
	
	}


}