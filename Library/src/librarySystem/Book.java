package librarySystem;

public class Book {
	//define variables
	String title;
	boolean rented = false;
	
	//constructor
	Book(String t){
		title = t;	
	}
	
	//method that marks a book as borrowed
	void borrowed() {
		rented = true;
	}
	
	//method that marks a book as returned
	void returned() {
		rented = false;
	}
	
	//method that returns true if a book is borrowed
	boolean isBorrowed() {
		return rented;
	}
		
	//displays title of a book
	String getTitle() {
		return title;
	}

	/*
	public static void main(String[] arguments) { 
		// Small test of the Book class 
		Book example = new Book("The Da Vinci Code");

		System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());

		System.out.println("Borrowed? (should be false): " + example.isBorrowed());

		example.borrowed();

		System.out.println("Borrowed? (should be true): " + example.isBorrowed());

		example.returned();

		System.out.println("Borrowed? (should be false): " + example.isBorrowed());

		} 
		*/

}
