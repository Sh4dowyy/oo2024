public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Room room101 = new Room(101, true);
        Room room102 = new Room(102, false);

        hotel.addRoom(room101);
        hotel.addRoom(room102);

        hotel.listRooms();

        System.out.println("\nAttempting to book room 101...");
        room101.book();

        System.out.println("\nAttempting to book room 102...");
        room102.book();
    }
}