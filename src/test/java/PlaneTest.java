import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

     Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasWeightAndCapacity() {
        assertEquals(100,plane.getCapacity());
        assertEquals(10000,plane.getWeight(),0.01);
    }
}
