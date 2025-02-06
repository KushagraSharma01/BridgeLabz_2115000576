import java.util.*;
class Student{
	String name;
	int rollNo;
	List<Subject> subjects;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
		subjects = new ArrayList<>();
	}
	
	public void addSubject(Subject s1){
		subjects.add(s1);
		System.out.println("Subject "+s1.name+" added for student : "+name);
	}

	public void showDetails(){
		System.out.println("Student name is : "+name);
		System.out.println("Student roll number is : "+rollNo);
		
	}
}