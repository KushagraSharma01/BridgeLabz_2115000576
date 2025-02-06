import java.util.*;
class Subject{
	String name;
	int marks;
	
	Subject(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	
	public void showDetails(){
		System.out.println("Subject name is : "+name);
		System.out.println("Subject marks are : "+marks);
	}
}