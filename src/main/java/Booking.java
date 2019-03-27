import java.util.ArrayList;

public class Booking {

    private ArrayList<Bedroom> bedrooms;
    private int nightsBooked;

    public Booking(int nightsBooked) {
        this.bedrooms = new ArrayList<>();
        this.nightsBooked = nightsBooked;
    }

    public int showNightsBooked() {
        return this.nightsBooked;
    }

    public int getBedrooms() {
        return this.bedrooms.size();

    }

    public void addBooking(Bedroom bedroom) {
        bedroom.setBooked(true);
        this.bedrooms.add(bedroom);
    }



}
