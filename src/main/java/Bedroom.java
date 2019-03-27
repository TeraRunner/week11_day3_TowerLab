import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private int type;
    private ArrayList<Guest> guestList;
    private int nightlyRate;
    private boolean booked;

    public Bedroom(int roomNumber, int capacity, int type, int nightlyRate, boolean booked) {

        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestList = new ArrayList<>();
        this.nightlyRate = nightlyRate;
        this.booked = booked;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getType() {
        return type;
    }

    public int getGuestList() {
        return guestList.size();
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public boolean getBooked() {
        return booked;
    }

    public void setBooked(Boolean newBook) {
        this.booked = newBook;
    }

    public void addGuest(Guest guest) {
        this.guestList.add(guest);
    }

    public void removeGuest() {
        this.guestList.clear();
    }

}
