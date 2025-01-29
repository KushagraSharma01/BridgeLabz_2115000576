import java.util.*;
class Compare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		boolean match = true;
		for(int i=0;i<str1.length()&&i<str2.length();i++){
			if(str1.charAt(i) > str2.charAt(i)){
				String temp = str1;
				str1 = str2;
				str2 = temp;
				match = false;
				break;
			}
			else if(str1.charAt(i) < str2.charAt(i)){
				match = false;
				break;
			}
		}
		if(match && str2.length()<str1.length()){
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		System.out.println(str1+" is lexicographically smaller than "+str2);
	}
}