
package LibraryManagementSystem;
public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        this.available = status;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + available);
    }
}
