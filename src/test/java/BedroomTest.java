import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 1, 1, 20);
        guest = new Guest("Bob");
    }

    @Test
    public void getRoomProperties() {
        assertEquals(1, bedroom.getRoomNumber());
        assertEquals(1, bedroom.getCapacity());
        assertEquals(1, bedroom.getType());
        assertEquals(0, bedroom.getGuestList());
    }

    @Test
    public void addGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestList());
    }

    @Test
    public void removeGuest() {
        bedroom.addGuest(guest);
        bedroom.removeGuest();
        assertEquals(0, bedroom.getGuestList());
    }

    @Test
    public void getNightlyRate() {
        assertEquals(20, bedroom.getNightlyRate());
    }

}
