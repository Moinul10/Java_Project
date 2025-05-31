
package HotelManagementSystem;
public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
        System.out.println("Room " + roomNumber + " is now booked.");
    }

    public void displayRoomInfo() {
        System.out.println("Room No: " + roomNumber + ", Type: " + roomType + ", Available: " + isAvailable);
    }
}

