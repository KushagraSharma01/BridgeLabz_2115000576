import java.util.*;
class Hospital{
	String name;
	List<Doctor> doctors;
	List<Patient> patients;
	
	Hospital(String name){
		this.name = name;
		doctors = new ArrayList<>();
		patients = new ArrayList<>();
	}
	
	public void addDoctor(Hospital.Doctor d){
		doctors.add(d);
		System.out.println("Doctor "+d.name+" has been added"); 
	}
	
	public void addPatient(Hospital.Patient p){
		patients.add(p);
		System.out.println("Patient "+p.name+" has been added");
	}
	
	public void showPatients(){
		System.out.println("Patients in the Hospital : "+name+" are:");
		for(int i=0;i<patients.size();i++)
			System.out.println(patients.get(i).name);
	}
	
	public void showDoctors(){
		System.out.println("Doctors in the Hopital : "+name+" are:");
		for(int i=0;i<doctors.size();i++)
			System.out.println(doctors.get(i).name);
	}
	
	
	static class Doctor{
		String name;
		List<Hospital.Patient> patients;
		
		Doctor(String name){
			this.name = name;
			patients = new ArrayList<>();
		}
		
		public void consult(Hospital.Patient p){
			patients.add(p);
			p.doctors.add(this);
			System.out.println("Patient "+p.name+" has consulted the doctor "+name);
		}
		
		public void showPatients(){
			System.out.println("Patients who consulted doctor : "+name+" are:");
			for(int i=0;i<patients.size();i++)
				System.out.println(patients.get(i).name);
		}
	}
	
	static class Patient{
		String name;
		List<Hospital.Doctor> doctors;

		Patient(String name){
			this.name = name;
			doctors = new ArrayList<>();
		}
		
		public void showDoctors(){
			System.out.println("Doctors who are consulted by patient : "+name+" are:");
			for(int i=0;i<doctors.size();i++)
				System.out.println(doctors.get(i).name);
		}
		
	}
}