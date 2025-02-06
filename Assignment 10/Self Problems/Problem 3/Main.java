class Main{
	public static void main(String[] args){
		Hospital h = new Hospital("AIMS");
		
		Hospital.Doctor d1 = new Hospital.Doctor("Vishesh Sharma");
		Hospital.Doctor d2 = new Hospital.Doctor("Anubhav Bindra");
		
		Hospital.Patient p1 = new Hospital.Patient("Kushagra Gupta");
		Hospital.Patient p2 = new Hospital.Patient("Manav Mittal");
		
		h.addDoctor(d1);
		h.addDoctor(d2);
		
		h.addPatient(p1);
		h.addPatient(p2);
		
		d1.consult(p1);
		d1.consult(p2);
		
		d2.consult(p1);
		
		d1.showPatients();
		d2.showPatients();
		
		p1.showDoctors();
		p2.showDoctors();
	
		h.showDoctors();
		h.showPatients();
	}
}