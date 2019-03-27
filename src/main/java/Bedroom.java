import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private int type;
    private ArrayList<Guest> guestList;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, int type, int nightlyRate) {

        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestList = new ArrayList<>();
        this.nightlyRate = nightlyRate;

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

    public void addGuest(Guest guest) {
        this.guestList.add(guest);
    }

    public void removeGuest() {
        this.guestList.clear();
    }

}
