
package HotelManagementSystem;
public class Booking {
    private Guest guest;
    private Room room;

    public Booking(Guest guest, Room room) {
        this.guest = guest;
        this.room = room;
    }

    public void confirmBooking() {
        if (room.isAvailable()) {
            room.bookRoom();
            System.out.println("Booking confirmed for:");
            guest.displayGuestInfo();
        } else {
            System.out.println("Room is not available.");
        }
    }
}

