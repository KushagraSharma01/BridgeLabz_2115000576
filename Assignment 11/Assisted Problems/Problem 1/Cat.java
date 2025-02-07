class Cat extends Animal{
	
	Cat(String name, int age){
		super(name, age);
	}
	
	public void makeSounds(){
		System.out.println("This cat "+super.name+" make sounds");
	}

}