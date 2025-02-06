public class Main {
    public static void main(String[] args) {
        University university = new University();

        University.Student student1 = new University.Student("Alice");
        University.Student student2 = new University.Student("Bob");

        University.Professor professor1 = new University.Professor("Dr. Smith");
        University.Professor professor2 = new University.Professor("Dr. Johnson");

        University.Course course1 = new University.Course("Data Structures");
        University.Course course2 = new University.Course("Artificial Intelligence");

        university.addStudent(student1);
        university.addStudent(student2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addCourse(course1);
        university.addCourse(course2);

        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);

        System.out.println("\nCourses taught by professors:");
        course1.displayProfessor();
        course2.displayProfessor();

        System.out.println("\nStudents enrolled in Data Structures:");
        course1.displayStudents();
    }
}
