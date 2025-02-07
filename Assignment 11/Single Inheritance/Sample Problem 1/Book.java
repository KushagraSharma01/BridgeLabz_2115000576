class Book{
	String title;
	int publicationYear;
	
	Book(String title, int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	public void displayInfo(){
		System.out.println("Book title is : "+title);
		System.out.println("Publication year is :"+publicationYear);
	}
}