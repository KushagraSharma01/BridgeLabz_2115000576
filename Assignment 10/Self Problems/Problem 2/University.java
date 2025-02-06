import java.util.*;
class University{
	String name;
	List<Faculty> faculties;
	List<Department> departments;
	
	University(String name){
		this.name = name;
		faculties = new ArrayList<>();
		departments = new ArrayList<>();
	}
	
	public void addDepartment(String depName){
		Department dp = new Department(depName);
		departments.add(dp);
		System.out.println("Department "+depName+" created in Univeristy "+name);
	}
	
	public void addFaculty(Faculty f){
		faculties.add(f);
		boolean fa = false;
		for(int i=0;i<departments.size();i++){
			if(departments.get(i).name.equals(f.depName)){
				departments.get(i).faculties.add(f);
				System.out.println("Faculty "+f.name+" is add to department "+f.depName+" in Univeristy "+name);
				fa = true;
				break;
			}
		}
		if(!fa)
			System.out.println("No such department found");
	}
	
	public void showAllFaculties(){
		System.out.println("All faculties in Uiversity "+name+" are :");
		for(int i=0;i<faculties.size();i++)
			System.out.println("Name : "+faculties.get(i).name+" Department : "+faculties.get(i).depName);
	}
	
	public void showAllDepartments(){
		System.out.println("All departments in University "+name+" are : ");
		for(int i=0;i<departments.size();i++)
			System.out.println(departments.get(i).name);
	}

}