// Set 4: Library Management System
// Interface Library → Contains method issue_book().
// Class Book (Base Class) → Attributes: title, author, isbn, availableCopies.
// Class Member (Child Class) → Extends Book, implements Library.
// User-Defined Exception: BookNotAvailableException if available copies = 0

class BookNotAvailableException extends Exception{
	BookNotAvailableException(String message){
		super(message);
	}
}

interface Library{
	void issue_book() throws BookNotAvailableException;
}

class book{
	String title,author;
	int isbn,availableCopies;
	
	book(String title,String author,int isbn,int availableCopies){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}
	
	void displayDetails(){
		System.out.println("Title = " + this.title);
		System.out.println("Author = " + this.author);
		System.out.println("ISBN = "+ this.isbn);
		System.out.println("Copies = "+this.availableCopies);
	}
}

class member extends book implements Library{
	member(String title,String author,int isbn,int availableCopies){
		super(title,author,isbn,availableCopies);
	}
	
	public void issue_book() throws BookNotAvailableException{
		if(availableCopies == 0){
			throw new BookNotAvailableException("Book is Not available");
		}else{
			displayDetails();
		}
	}
}

public class set4{
	public static void main(String args[]){
		
		try{
			member m1 = new member("Subtitle","not",123,1);
			member m2 = new member("Atomic Habit","James",124,0);
			m1.issue_book();
			m2.issue_book();
		}catch(BookNotAvailableException e){
			System.out.println("Exception : "+ e);
		}
	}
}