class Dog extends Animal{
	
	Dog(String name, int age){
		super(name, age);
	}
	
	public void makeSounds(){
		System.out.println("This Dog "+super.name+" makes sounds");
	}
}