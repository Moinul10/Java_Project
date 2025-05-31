
package LibraryManagementSystem;
public class Library {
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void showWelcomeMessage() {
        System.out.println("Welcome to " + libraryName + " Library!");
    }
}
