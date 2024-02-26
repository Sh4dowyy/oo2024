import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void listRooms() {
        System.out.println("Rooms available:");
        for (Room room : rooms) {
            System.out.println("Room " + room.getNumber() + ": " + (room.isBooked() ? "Booked" : "Available"));
        }
    }
}