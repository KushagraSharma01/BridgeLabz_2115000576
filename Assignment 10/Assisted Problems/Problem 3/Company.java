import java.util.*;
class Company{
	String name;
	List<Department> departments;
	
	Company(String name){
		this.name = name;
		departments = new ArrayList<>();
	}
	
	public void addDepartment(String depName){
		Department dp = new Department(depName);
		departments.add(dp);
		System.out.println("Department "+depName+" is added to Company "+name);
	}
	
	public void addEmployee(String empName, int empId, String depName){
		Employee emp = new Employee(empName, empId, depName);
		boolean f = false;
		for(int i=0;i<departments.size();i++){
			if(depName.equals(departments.get(i).name)){
				departments.get(i).employees.add(emp);
				System.out.println("New Employee "+empName+" is added to department "+depName+" in Company "+name);
				f = true;
				break;
			}
		}
		if(!f)
			System.out.println("No matching Department found");
	}
	
	public void showAllEmployees(){
		System.out.println("All the employees in the company "+name+" are :");
		for(int i=0;i<departments.size();i++){
			for(int j=0;j<departments.get(i).employees.size();j++)
				System.out.println("Employee name : "+departments.get(i).employees.get(j).name+"\nDepartment Name: "+departments.get(i).name+"\n");
			
		}	
	}
	
	public void showAllDepartments(){
		System.out.println("Company "+name+" has the following departments :");
		for(int i=0;i<departments.size();i++)
			System.out.println(departments.get(i).name);
	}
}