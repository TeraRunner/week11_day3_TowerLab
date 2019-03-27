import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Booking booking;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(10, 2, 2, 40, false);
        bedroom2 = new Bedroom(13, 1, 1, 20, false);
        conferenceRoom = new ConferenceRoom(10, "Con Room");
        guest = new Guest("Bob");
        booking = new Booking(5);
    }

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        assertEquals(2, hotel.getBedroomList());
    }

    @Test
    public void canAddConferenceroom() {
        hotel.addConferenceroom(conferenceRoom);
        assertEquals(1, hotel.getConferenceroomList());
    }

    @Test
    public void checkInOutTest() {
        hotel.addBedroom(bedroom);
        assertEquals(0, bedroom.getGuestList());
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getGuestList());
        hotel.checkOutGuest(bedroom);
        assertEquals(0, bedroom.getGuestList());
    }

    @Test
    public void addBookingTest() {
        hotel.roomBooked(bedroom, booking);
        assertEquals(1, booking.getBedrooms());
        assertEquals(5, booking.showNightsBooked());
        assertEquals(200, hotel.getTotalNightlyRate(bedroom, booking));
    }

}
