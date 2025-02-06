import java.util.*;

class University {
    private List<Student> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void displayProfessors() {
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    static class Student {
        private String name;
        private List<Course> enrolledCourses = new ArrayList<>();

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void enrollCourse(Course course) {
            enrolledCourses.add(course);
            course.addStudent(this);
            System.out.println(name + " has enrolled in " + course.getCourseName());
        }

        public void displayEnrolledCourses() {
            for (Course course : enrolledCourses) {
                System.out.println(course.getCourseName());
            }
        }
    }

    static class Professor {
        private String name;

        public Professor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void assignCourse(Course course) {
            course.setProfessor(this);
            System.out.println(name + " is assigned to teach " + course.getCourseName());
        }
    }

    static class Course {
        private String courseName;
        private Professor professor;
        private List<Student> students = new ArrayList<>();

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setProfessor(Professor professor) {
            this.professor = professor;
        }

        public void displayProfessor() {
            if (professor != null) {
                System.out.println(professor.getName());
            } else {
                System.out.println("No professor assigned");
            }
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void displayStudents() {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}

