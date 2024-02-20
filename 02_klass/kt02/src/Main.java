public class Main {
    public static void main(String[] args) {
        HotelRoom room101 = new HotelRoom(101, false);
        HotelRoom room102 = new HotelRoom(102, true);

        room101.checkRoomStatus();
        room102.checkRoomStatus();

        System.out.printf("%nAttempting to book room 101...");
        room101.bookRoom();

        System.out.printf("%nAttempting to book room 102...");
        room102.bookRoom();
    }
}