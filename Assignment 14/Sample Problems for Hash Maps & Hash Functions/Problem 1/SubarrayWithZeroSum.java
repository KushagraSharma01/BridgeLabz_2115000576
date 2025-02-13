import java.util.*;
class SubarrayWithZeroSum{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(0, 0);
		
		for(int i=0;i<n;i++){
			int sum = 0;
			for(int j=i;j<n;j++){
				sum += arr[j];
				if(hm.containsKey(sum))
					hm.put(sum, hm.get(sum) + 1);
				else
					hm.put(sum, 1);
			}
		}
		
		for(int key : hm.keySet()){
			if(key == 0)
				System.out.println("Number of subarrays having sum zero are : "+hm.get(key));
		} 
	
	}

}