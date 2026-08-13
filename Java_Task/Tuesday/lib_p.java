package Java_Task.Tuesday;
import java.util.*;


// Interface
interface Borrowable {

    void borrowItem();

    void returnItem();
}


// Abstract class
abstract class LibraryItem {

    String title;
    int itemId;
    boolean isAvailable;

    LibraryItem(String title, int itemId) {

        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    // Abstract method
    abstract int getLoanPeriod();

    // Display common details
    void displayDetails() {

        System.out.println("Item ID       : " + itemId);
        System.out.println("Title         : " + title);
        System.out.println("Available     : " + isAvailable);
        System.out.println("Loan Period   : " + getLoanPeriod() + " days");
    }
}


// Book
class Book extends LibraryItem implements Borrowable {

    Book(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 21;
    }

    @Override
    public void borrowItem() {

        if (isAvailable) {

            isAvailable = false;

            System.out.println(
                "Book \"" + title + "\" borrowed successfully."
            );

            System.out.println(
                "Loan period: " + getLoanPeriod() + " days"
            );

        } else {

            System.out.println(
                "Book \"" + title + "\" is already borrowed."
            );
        }
    }

    @Override
    public void returnItem() {

        if (!isAvailable) {

            isAvailable = true;

            System.out.println(
                "Book \"" + title + "\" returned successfully."
            );

        } else {

            System.out.println(
                "Book \"" + title + "\" was not borrowed."
            );
        }
    }
}


// Magazine
class Magazine extends LibraryItem {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 0;
    }

    // Magazine does NOT implement Borrowable
}


// DVD
class DVD extends LibraryItem implements Borrowable {

    DVD(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 7;
    }

    @Override
    public void borrowItem() {

        if (isAvailable) {

            isAvailable = false;

            System.out.println(
                "DVD \"" + title + "\" borrowed successfully."
            );

            System.out.println(
                "Loan period: " + getLoanPeriod() + " days"
            );

        } else {

            System.out.println(
                "DVD \"" + title + "\" is already borrowed."
            );
        }
    }

    @Override
    public void returnItem() {

        if (!isAvailable) {

            isAvailable = true;

            System.out.println(
                "DVD \"" + title + "\" returned successfully."
            );

        } else {

            System.out.println(
                "DVD \"" + title + "\" was not borrowed."
            );
        }
    }
}


// Librarian
class Librarian {

    ArrayList<LibraryItem> items = new ArrayList<>();

    void addItem(LibraryItem item) {

        items.add(item);
    }

    void displayAllItems() {

        System.out.println("\n========== ALL LIBRARY ITEMS ==========");

        for (LibraryItem item : items) {

            System.out.println("\n-------------------------");

            item.displayDetails();
        }
    }
}


// Main class
public class lib_p {

    public static void main(String[] args) {

        // Create objects

        Book book = new Book(
            "Java Programming",
            101
        );

        Magazine magazine = new Magazine(
            "Tech Today",
            102
        );

        DVD dvd = new DVD(
            "Introduction to AI",
            103
        );


        // Create librarian

        Librarian librarian = new Librarian();


        // Add all items

        librarian.addItem(book);
        librarian.addItem(magazine);
        librarian.addItem(dvd);


        // Display all items

        librarian.displayAllItems();


        // Borrow Book

        System.out.println("\n========== BORROW BOOK ==========");

        book.borrowItem();


        // Borrow DVD

        System.out.println("\n========== BORROW DVD ==========");

        dvd.borrowItem();


        // Attempt to borrow Magazine

        System.out.println("\n========== BORROW MAGAZINE ==========");

        System.out.println(
            "Magazine \"" + magazine.title +
            "\" cannot be borrowed because it is reference-only."
        );


        // Return Book

        System.out.println("\n========== RETURN BOOK ==========");

        book.returnItem();


        // Return DVD

        System.out.println("\n========== RETURN DVD ==========");

        dvd.returnItem();


        // Display final status

        librarian.displayAllItems();
    }
}