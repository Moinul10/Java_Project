
package LibraryManagementSystem;
public class Member extends User {
    private Account account;

    public Member(String name, String userId, Account account) {
        super(name, userId);
        this.account = account;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(name + " returned: " + book.getTitle());
    }
}


