import java.util.*;
class GradeCalculator{
	Student student;
	
	GradeCalculator(Student student){
		this.student = student;
	}
	
	public void calculateGrade(){
		int sum = 0;
		for(int i=0;i<student.subjects.size();i++){
			sum += student.subjects.get(i).marks;
		}
		sum = sum/student.subjects.size();
		if(sum >= 80)
			System.out.println("Grade is A");
		else if(sum >= 70)
			System.out.println("Grade is B");
		else if(sum >= 60) 
			System.out.println("Grade is C");
		else if(sum >= 50)
			System.out.println("Grade is D");
		else
			System.out.println("Grade is F");
	}
}