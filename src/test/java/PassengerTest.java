import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Aresky", 3);

    }

    @Test
    public void hasNameAndNumberOfBags(){
        assertEquals(3,passenger1.getNumberOfBags());
        assertEquals("Aresky",passenger1.getName());
    }




}
