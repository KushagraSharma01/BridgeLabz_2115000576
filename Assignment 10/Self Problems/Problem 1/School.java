import java.util.*;
class School{
	String name;
	List<Student> students;
	
	School(String name){
		this.name = name;
		students = new ArrayList<>();
	}
	
	public void addStudent(Student s){
		students.add(s);
		System.out.println("Student "+s.name+" is added to school "+name);
	}
	
	public void showAllStudents(){
	System.out.println("Student in school "+name+" are :");
		for(int i=0;i<students.size();i++)
			System.out.println("Student name is : "+students.get(i).name+" and roll number is : "+students.get(i).rollNo);
	}
}