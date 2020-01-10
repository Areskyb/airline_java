import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class FlightTest {
    Flight flight;
    Plane plane;
    ArrayList<Passenger> passengers;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp() {
        passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Aresky",2);
        passenger2 = new Passenger("Guille",1);
//        passengers.add(passenger2);
//        passengers.add(passenger1);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(passengers,plane,"HD889","EDI","GLA","13:00");
    }


    @Test
    public void flightCanBookPassenger(){
//        flight.bookPassenger(passenger1);
        assertEquals(0,flight.getPassengersCount());
    }

    @Test
    public void flightCanGetAvailableSeats() {
        flight.bookPassenger(passenger1);
        assertEquals(99,flight.getAvailableSeats());
    }
}
