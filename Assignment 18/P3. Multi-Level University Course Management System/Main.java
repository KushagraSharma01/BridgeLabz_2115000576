import java.util.*;
class Main{
	
	public static void main(String[] args){
		
		ExamBased e1 = new ExamBased("DSA", 10);
		AssignmentBased a1 = new AssignmentBased("Web Dev", 15);
		ResearchBased r1 = new ResearchBased("AI", 25);
		
		Course<ExamBased> c1 = new Course<>();
		Course<AssignmentBased> c2 = new Course<>();
		Course<ResearchBased> c3 = new Course<>();
		
		c1.add(e1);
		c2.add(a1);
		c3.add(r1);
		
		displayCourseDetails(c1.courses);
		displayCourseDetails(c2.courses);
		displayCourseDetails(c3.courses);
		
	}
	public static void displayCourseDetails(List<? extends CourseType> courses){
		for(int i=0;i<courses.size();i++)
			courses.get(i).displayDetails();
	}


}