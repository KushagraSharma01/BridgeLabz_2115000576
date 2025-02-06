class Main{
	public static void main(String[] args){
		School sc1 = new School("Baluni Public School");
		
		Student s1 = new Student("Kushagra Sharma", 2115000576);
		Student s2 = new Student("Vishesh Sharma", 2115000578);
		Student s3 = new Student("Naman Agarwal", 2115000611);
		Student s4 = new Student("Vedansh Gautam", 2115000605);
		
		sc1.addStudent(s1);
		sc1.addStudent(s2);
		sc1.addStudent(s3);
		sc1.addStudent(s4);
		
		Course m1 = new Course("Maths");
		Course ch1 = new Course("Chemistry");
		Course ph1 = new Course("Physics");
		Course bi1 = new Course("Biology");
		
		s1.enrollInCourse(m1);
		s1.enrollInCourse(ch1);
		s1.enrollInCourse(ph1);
		
		s2.enrollInCourse(ch1);
		s2.enrollInCourse(ph1);
		s2.enrollInCourse(bi1);
		
		s3.enrollInCourse(m1);
		
		s4.enrollInCourse(ch1);
		
		m1.showAllStudents();
		ch1.showAllStudents();
		
		sc1.showAllStudents();
		
		s1.showAllCourses();
	}
	
}