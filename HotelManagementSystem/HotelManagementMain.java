
package HotelManagementSystem;
public class HotelManagementMain {
    public static void main(String[] args) {
        // Create a guest
        Guest guest = new Guest("Moinul Islam ", "G123", "0123456789");

        // Create a room
        Room room = new Room(101, "Deluxe");

        // Create a booking
        Booking booking = new Booking(guest, room);

        // Display room info before booking
        room.displayRoomInfo();

        // Confirm booking
        booking.confirmBooking();

        // Display room info after booking
        room.displayRoomInfo();

        // Create an employee
        Employee emp = new Employee("Sarah Lee", "E456", "Receptionist");
        System.out.println("\nEmployee Info:");
        emp.displayEmployeeInfo();
    }
}
