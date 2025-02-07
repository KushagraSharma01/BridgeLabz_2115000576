class Bird extends Animal{
	
	Bird(String name, int age){
		super(name, age);
	}
	
	public void makeSounds(){
		System.out.println("This bird "+super.name+" make sounds");
	}
}