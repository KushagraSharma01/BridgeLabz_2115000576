import java.util.*;
class Toggle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				str2 += (char)(str.charAt(i)-32);
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				str2 += (char)(str.charAt(i)+32);
			else
				str2 += str.charAt(i);
		}
		System.out.println("String after toggling is : "+str2);
	}

}