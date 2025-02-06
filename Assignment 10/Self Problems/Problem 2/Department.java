import java.util.*;
class Department{
	String name;
	List<Faculty> faculties;
	
	Department(String name){
		this.name = name;
		faculties = new ArrayList<>();
	}
	
	public void showAllFaculties(){
		System.out.println("All faculties in department "+name+" are:");
		for(int i=0;i<faculties.size();i++)
			System.out.println(faculties.get(i).name);
	}
}