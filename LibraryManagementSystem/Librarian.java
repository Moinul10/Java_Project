
package LibraryManagementSystem;
public class Librarian extends User {
    public Librarian(String name, String userId) {
        super(name, userId);
    }

    public void manageLibrary() {
        System.out.println(name + " is managing the library.");
    }
}
