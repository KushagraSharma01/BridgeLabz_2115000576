import java.util.*;
class Course{
	String name;
	List<Student> students;
	
	Course(String name){
		this.name = name;
		students = new ArrayList<>();
	}
	
	public void showAllStudents(){
		System.out.println("All the students enrolled in course "+name+" are :");
		for(int i=0;i<students.size();i++)
			System.out.println("Student Name : "+students.get(i).name+" Roll Number : "+students.get(i).rollNo);
	}
}