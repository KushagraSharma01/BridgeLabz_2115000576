import java.util.*;
class VowelsAndConsonants{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int vCount = 0, cCount = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' ||str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U')
				vCount++;
			else
				cCount++;
		}
		System.out.println("The number of vowels are "+vCount+" and number of consonants are "+cCount);
	}
}