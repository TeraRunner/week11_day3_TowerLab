import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before

    public void before() {
        booking = new Booking(6 );
        bedroom = new Bedroom(2, 2, 2, 40);

    }

    @Test
    public void nightsBookedNumber() {
        assertEquals(6, booking.showNightsBooked());
    }

    @Test
    public void addBookingTest() {
        booking.addBooking(bedroom);
        assertEquals(1, booking.getBedrooms());
    }
}
