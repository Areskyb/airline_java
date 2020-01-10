import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager manager;
    Flight flight;
    Plane plane;
    ArrayList<Passenger> passengers;
    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void setUp() {
        manager = new FlightManager();
        passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Aresky",2);
        passenger2 = new Passenger("Guille",1);
        passengers.add(passenger2);
        passengers.add(passenger1);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(passengers,plane,"HD889","EDI","GLA","13:00");
    }

    @Test
    public void returnTotalWeightForPassengers() {
        assertEquals(50.00,manager.getWeightForPassangers(flight.getPlane()), 0.01);
    }

    @Test
    public void returnsTotalWeightOfTheFlight() {
        assertEquals(60.00,manager.totalWeightOfFlight(flight),0.01);
    }

    @Test
    public void getsTheRemainWeightReserved() {
        assertEquals(4940.00,manager.overAllWeightRemaining(flight),0.01);
    }
}
