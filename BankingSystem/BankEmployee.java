
package BankingSystem;
public class BankEmployee extends Person {
    private String position;

    public BankEmployee(String name, String id, String position) {
        super(name, id);
        this.position = position;
    }

    public void assistCustomer(Customer customer) {
        System.out.println(name + " is assisting customer " + customer.name);
    }

    public void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Position: " + position);
    }
}
