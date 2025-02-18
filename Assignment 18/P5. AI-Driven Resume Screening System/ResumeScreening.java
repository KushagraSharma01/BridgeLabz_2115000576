import java.util.*;
public class ResumeScreening {
   
	public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Processing resume for: " + role.getTitle());
        }
    }
    
	public static void main(String[] args) {
        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(new SoftwareEngineer());
        jobRoles.add(new DataScientist());
        processResumes(jobRoles);
	}
}