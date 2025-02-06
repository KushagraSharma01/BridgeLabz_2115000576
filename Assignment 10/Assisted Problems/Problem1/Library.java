import java.util.*;
class Library{
	String name;
	List<Book> books;
	
	Library(String name){
		this.name = name;
		books = new ArrayList<>();
	}
	
	public void addBook(Book b){
		books.add(b);
		System.out.println("Book "+b.title+" added to Library "+name);
	}
	
	public void displayBooks(){
		System.out.println("This Library has the following books : ");
		for(int i=0;i<books.size();i++)
			System.out.println(books.get(i).title);
	}
	
	public void displayDetails(){
		System.out.println("Library name is : "+name);
	}
	
}