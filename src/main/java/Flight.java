import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
//    GETTERS
//    *****************************************************************************
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getPassengersCount(){
        return this.passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    //    ***************************************************************************

    public int getAvailableSeats(){
        int capacity = plane.getCapacity();
        int p = passengers.size();
        if(capacity > p){
            return capacity - p;
        }else {
            return 0;
        }
    }

    public void bookPassenger(Passenger passenger){
        if (getAvailableSeats()!= 0){
            this.passengers.add(passenger);
        }
    }


}
