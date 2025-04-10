// Create a class Book with overloaded constructors: one with no arguments, one with the title,
// and another with title and author.
import java.util.Scanner;

public class bookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();

        book b1 = new book(title, author);
        book b2 = new book();
        book b3 = new book(title);

        b1.display();
        b2.display();
        b3.display();

    }
}

class book{
    String title, author;

    book(String title, String author){
        this.title = title;
        this.author = author;
    }

    book(){
        this("No title", "No author");
    }

    book(String title){
        this(title, "No author");
    }

    void display(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}