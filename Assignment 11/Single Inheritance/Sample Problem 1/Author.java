class Author extends Book{
	String name;
	String bio;

	Author(String name, String bio, String title, int publicationYear){
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	public void displayInfo(){
		System.out.println("Name of the Author is : "+name);
		System.out.println("Bio of the Author is : "+bio);
		System.out.println("Book written by this author has title : "+super.title);
		System.out.println("Publication year of the book written by this author is : "+super.publicationYear);
	}
}