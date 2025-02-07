class Animal{
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	
	public void makeSounds(){
		System.out.println("This Animal "+name+" make sounds");
	}
}