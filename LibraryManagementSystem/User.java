
package LibraryManagementSystem;
public class User {
    protected String name;
    protected String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public void displayUserInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User ID: " + userId);
    }
}
