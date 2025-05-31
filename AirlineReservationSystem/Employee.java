
package AirlineReservationSystem;
public class Employee extends Person {
    private String position;

    public Employee(String name, String id, String position) {
        super(name, id);
        this.position = position;
    }

    public void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Position: " + position);
    }
}
