public class HotelRoom {
    private int roomNumber;
    private boolean isBooked;

    public HotelRoom(int roomNumber, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.isBooked = isBooked;
    }
    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.printf("%nRoom " + roomNumber + " booked successfully!");
            return;
        }
        System.out.printf("%nError. Room " + roomNumber + " is already booked.");
    }

    public void checkRoomStatus() {
        if (isBooked) {
            System.out.println("Room " + roomNumber + " is booked right now!");
            return;
        }
        System.out.println("Room " + roomNumber + " is free to book!");
    }
}
