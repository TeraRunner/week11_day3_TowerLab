import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public int getBedroomList() {
       return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int getConferenceroomList() {
        return this.conferenceRooms.size();
    }

    public void addConferenceroom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuest(Bedroom bedroom) {
        bedroom.removeGuest();
    }

    public Booking roomBooked(Bedroom bedroom, Booking booking) {
        booking.addBooking(bedroom);
        return booking;
    }

    public int getTotalNightlyRate(Bedroom bedroom, Booking booking) {
        return booking.showNightsBooked() * bedroom.getNightlyRate();
    }

}
