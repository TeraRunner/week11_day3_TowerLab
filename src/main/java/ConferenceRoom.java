import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> members;
    private String name;

    public ConferenceRoom(int capacity, String name) {

        this.capacity = capacity;
        this.members = new ArrayList<>();
        this.name = name;

    }

    public int getCapacity() {

        return this.capacity;
    }

    public int getMemberList() {
        return this.members.size();
    }

    public String getRoomName() {
        return this.name;
    }

    public void addGuest(Guest guest) {
        this.members.add(guest);
    }

    public void removeGuest() {
        this.members.clear();
    }

}
