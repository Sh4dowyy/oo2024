public class Room {
    private final int number;
    private boolean isBooked;

    public Room(int number, boolean isBooked) {
        this.number = number;
        this.isBooked = isBooked;
    }

    public void book() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + number + " is now booked.");
        } else {
            System.out.println("Room " + number + " is already booked.");
        }
    }

    public int getNumber() {
        return number;
    }

    public boolean isBooked() {
        return isBooked;
    }
}