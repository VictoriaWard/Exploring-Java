package librarySystem;

public class Library {
	String name;
	String address;
	String openingHours;
	Book [] bookCollection; //= new Book [100]; // do i need to add 100 here?
	
	Library(String n, String a, String o, Book [] books) {
		name = n;
		address = a;
		openingHours = o;
		bookCollection = books;
	}

	void displayOpeningHours() {
		System.out.println(name + "'s opening hours are: " + openingHours + "\n");
	}
	
	void displayAddress() {
		System.out.println(name + "'s address is: " + address + "\n");
	}
	
	void displayBookCollection() {
		System.out.print(name + " has the following books in its collection: \n");
		for (Book b: bookCollection)
			System.out.println(b.title);
		System.out.print("\n");
	}
	
	boolean checkCollection(Book b) {
		for (Book bookInCollection: bookCollection)
			if ((b.title).equals(bookInCollection.title))
				return true;
		return false;
		
	}
	
	void borrow(Book b) {
		System.out.println("Borrowing " + b.title + "...\n");
		if (checkCollection(b) == true) {
			if (b.isBorrowed())
				System.out.println("Sorry, " + b.title + " is already on loan. \n");
			if (b.isBorrowed() == false)
				System.out.println("You have succesfully borrowed " + b.title + "\n");
				b.borrowed();
		}
		
		if (checkCollection(b) == false)
			System.out.println("Sorry, " + b.title + " is not in our collection. \n");			
	}
	
	void returnBook(Book b) {
		System.out.print("You have successfully returned " + b.title + ". Thank you. \n");
		b.returned();
	}

	public static void main(String [] args) {
		//create some Book class instances
		Book braveNew = new Book("Brave New World");
		Book catch22 = new Book("Catch 22");
		Book devilsChaplain = new Book("A Devil's Chaplain");
		Book labyrinths = new Book("Labyrinths");
		Book harrypotter = new Book("Harry Potter and the Philosopher's Stone");
		Book prideandprejudice = new Book("Pride and Prejudice");
		Book blackbeauty = new Book("Black Beauty");
		Book treasureisland = new Book("Treasure Island");
		
		//create some Library class instances
		Library national = new Library("The National Library", "East 14th Street, Big City, 32120", "Monday to Thursday: 8am to 8pm\nFriday and Saturday: 8am to 5.30 pm", new Book [] {braveNew, catch22, devilsChaplain, labyrinths});
		Library mainstreet = new Library("Main Street Library", "33 Main Street, Big City, 32322", "Monday to Saturday: 9am to 6pm", new Book [] {harrypotter, prideandprejudice, blackbeauty, treasureisland});
	
		//tests
		System.out.println(national.checkCollection(treasureisland));
		national.displayOpeningHours();
		national.displayAddress();
		national.displayBookCollection();
		national.borrow(braveNew);
		national.borrow(treasureisland); 
		national.borrow(braveNew);	
		national.returnBook(braveNew);
		national.borrow(braveNew);
		national.borrow(catch22);
		
		mainstreet.displayBookCollection();
		mainstreet.borrow(treasureisland);
		mainstreet.borrow(devilsChaplain);	
		mainstreet.returnBook(treasureisland);
		
	}
		
}
