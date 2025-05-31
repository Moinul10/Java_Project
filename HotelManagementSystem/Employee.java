
package HotelManagementSystem;
public class Employee extends Person {
    private String role;

    public Employee(String name, String id, String role) {
        super(name, id);
        this.role = role;
    }

    public void displayEmployeeInfo() {
        displayInfo();
        System.out.println("Role: " + role);
    }
}
