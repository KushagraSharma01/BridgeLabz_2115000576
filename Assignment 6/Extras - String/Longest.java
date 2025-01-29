import java.util.*;
class Longest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String longestWord = "";
		String currWord = "";
		int maxLen = 0;
		int currLen = 0;
		for(int i=0;i<sentence.length();i++){
			if(sentence.charAt(i) == ' ' && maxLen < currLen){
				maxLen = currLen;
				longestWord = currWord;
			}
			if(sentence.charAt(i) == ' '){
				currWord = "";
				currLen = 0;
			}
			else{
				currWord += sentence.charAt(i);
				currLen++;
			}
		}
		System.out.println("The Longest word is "+longestWord);
	} 
}