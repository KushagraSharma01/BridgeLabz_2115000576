import java.util.*;
class Main{
	public static void main(String[] args){
		Student s1 = new Student("Kushagra Sharma", 119);
		Student s2 = new Student("Naman Agarwal", 125);
		
		Subject m1 = new Subject("Maths", 95);
		Subject m2 = new Subject("Maths", 78);
		
		Subject sc1 = new Subject("Science", 92);
		Subject sc2 = new Subject("Science", 65);
	
		s1.addSubject(m1);
		s1.addSubject(sc1);
		
		s2.addSubject(m2);
		s2.addSubject(sc2);
		
		GradeCalculator g1 = new GradeCalculator(s1);
		GradeCalculator g2 = new GradeCalculator(s2);
	
		g1.calculateGrade();
		g2.calculateGrade();
	}
}