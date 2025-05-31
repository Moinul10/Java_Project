
package LibraryManagementSystem;
public class Account {
    private String accountId;
    private int booksBorrowed;

    public Account(String accountId) {
        this.accountId = accountId;
        this.booksBorrowed = 0;
    }

    public void incrementBooks() {
        booksBorrowed++;
    }

    public void decrementBooks() {
        booksBorrowed--;
    }

    public void displayAccountInfo() {
        System.out.println("Account ID: " + accountId + ", Books Borrowed: " + booksBorrowed);
    }
}

