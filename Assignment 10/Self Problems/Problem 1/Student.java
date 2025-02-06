import java.util.*;
class Student{
	String name;
	int rollNo;
	List<Course> courses;

	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
		courses = new ArrayList<>();
	}

	public void enrollInCourse(Course c){
		courses.add(c);
		c.students.add(this); //trying to add this object of student
		System.out.println("Student "+name+" is enrolled in course "+c.name);
	}
	
	public void showAllCourses(){
		System.out.println("All the courses enrolled by student "+name+" are :");
		for(int i=0;i<courses.size();i++){
			System.out.println(courses.get(i).name);
		}
	}
}