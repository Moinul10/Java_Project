
package LibraryManagementSystem;
public class LibrarySystemMain {
    public static void main(String[] args) {
        // Create library
        Library lib = new Library("Central City");
        lib.showWelcomeMessage();

        // Create account and member
        Account account = new Account("AC1001");
        Member member = new Member("Moinul Islam", "S001", account);

        // Create librarian
        Librarian librarian = new Librarian("Mr. Thomas", "L001");

        // Create a book
        Book book = new Book("Java Basics", "John Smith");

        // Display book info
        book.displayBookInfo();

        // Borrow and return book
        member.borrowBook(book);
        book.displayBookInfo();

        member.returnBook(book);
        book.displayBookInfo();

        // Librarian action
        librarian.manageLibrary();
    }
}
