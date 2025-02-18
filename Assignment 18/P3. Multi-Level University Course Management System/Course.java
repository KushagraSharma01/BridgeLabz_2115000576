import java.util.*;

class Course<T extends CourseType>{

	List<T> courses;
	
	Course(){
		courses = new ArrayList<>();
	}
	
	public void add(T course){
		
		courses.add(course);
	
	}
	
	public void remoce(T course){
	
		courses.remove(course);
		
	}


}