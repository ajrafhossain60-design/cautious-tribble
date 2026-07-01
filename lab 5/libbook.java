class LibraryBook {
    String title;
    String author;
    String bookID;

    LibraryBook(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Basics", "Ajraf", "B101");
        LibraryBook book2 = new LibraryBook("Data Structures", "Rahim", "B102");
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
