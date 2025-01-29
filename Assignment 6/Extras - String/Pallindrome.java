import java.util.*;
class Pallindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i=0,j=str.length()-1;
		boolean isPallin = true;
		while(i<=j){
			if(str.charAt(i) != str.charAt(j)){
				isPallin = false;
				break;
			}
			i++;
			j--;
		}
		if(isPallin)
			System.out.println("Given String is Pallindrome");
		else
			System.out.println("Given String is not a Pallindrome");
	}
}