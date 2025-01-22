import java.util.*;
class MaximumHandshakes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int totalHandshakes = ((numberOfStudents-1)*(numberOfStudents))/2;
		System.out.println("Total number of possible handshakes are "+totalHandshakes);
	}
}