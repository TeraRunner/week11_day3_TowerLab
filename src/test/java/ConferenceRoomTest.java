import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before

    public void before() {
        conferenceRoom = new ConferenceRoom(10, "Big Room");
        guest = new Guest("Dante");
    }

    @Test
    public void getRoomDetails() {
        assertEquals(10, conferenceRoom.getCapacity());
        assertEquals(0, conferenceRoom.getMemberList());
        assertEquals("Big Room", conferenceRoom.getRoomName());
    }

    @Test
    public void addGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getMemberList());
    }

    @Test
    public void removeGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest();
        assertEquals(0, conferenceRoom.getMemberList());
    }
}
