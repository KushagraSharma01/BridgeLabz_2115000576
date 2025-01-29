import java.util.*;
class Substring{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int count = 0;
		for(int i=0;i<str1.length();i++){
			String tempStr = "";
			for(int j=i;j<i+str2.length() && j<str1.length();j++){
				tempStr += str1.charAt(j);
			}
			if(tempStr.equals(str2))
				count++;
		}
		System.out.println("The number of occurences are "+count);
	}
}