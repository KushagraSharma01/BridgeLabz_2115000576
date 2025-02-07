class Main{
	public static void main(String[] args){
		Animal an1 = new Animal("Rupert", 12);
		
		Dog d1 = new Dog("Bruno", 7);
		
		Cat c1 = new Cat("Billie", 6);
		
		Bird b1 = new Bird("Pitthu", 4);
		
		an1.makeSounds();
		d1.makeSounds();
		c1.makeSounds();
		b1.makeSounds();
	}

}