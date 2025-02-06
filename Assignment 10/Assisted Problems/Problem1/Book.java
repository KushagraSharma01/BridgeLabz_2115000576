import java.util.*;
class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public void displayDetails(){
		System.out.println("Title of this book is : "+title);
		System.out.println("Author of this book is : "+author);
	}
}