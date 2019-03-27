import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Jean");
    }

    @Test
    public void getNameTest() {
        assertEquals("Jean", guest.getName());
    }

}
