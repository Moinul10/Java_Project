
package AirlineReservationSystem;
public class Passenger extends Person {
    private String passportNumber;

    public Passenger(String name, String id, String passportNumber) {
        super(name, id);
        this.passportNumber = passportNumber;
    }

    public void displayPassengerInfo() {
        displayPersonInfo();
        System.out.println("Passport Number: " + passportNumber);
    }
}
