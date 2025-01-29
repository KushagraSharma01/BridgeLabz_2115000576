import java.util.*;
class RemoveDuplicates{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] freq = new int[128];
		String str2 = "";
		for(int i=0;i<str.length();i++){
			if(freq[str.charAt(i)] == 0)
				str2 += str.charAt(i);
			freq[str.charAt(i)]++;
		}
		System.out.println("Resulting String is "+str2);
	}
}