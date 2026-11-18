
class Library {
    String title;
    String author;
    double price;

    // Static variable
    static int bookCount = 0;

    // Constructor
    Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Static method
    static void displayCount() {
        System.out.println("Total Books: " + bookCount);
    }
}

public class Main {
    public static void main(String[] args) {

        Library b1 = new Library("Java", "James", 450);
        Library b2 = new Library("Python", "Guido", 500);
        Library b3 = new Library("C Programming", "Dennis", 350);

        b1.display();
        b2.display();
        b3.display();

        Library.displayCount();
    }
}

