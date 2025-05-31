
package HotelManagementSystem;
public class Guest extends Person {
    private String phoneNumber;

    public Guest(String name, String id, String phoneNumber) {
        super(name, id);
        this.phoneNumber = phoneNumber;
    }

    public void displayGuestInfo() {
        displayInfo();
        System.out.println("Phone: " + phoneNumber);
    }
}
