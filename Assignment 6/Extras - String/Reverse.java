import java.util.*;
class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = "";
		for(int i=str.length()-1;i>=0;i--)
			str2 += str.charAt(i);
		str = str2;
		System.out.println("Reversed String is "+str);
	}
}