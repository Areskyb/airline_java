import java.util.ArrayList;

public class FlightManager {


    public double getWeightForPassangers(Plane plane){

        double weight = (plane.getWeight())/2;
        int capacity = plane.getCapacity();
        return weight/capacity;
    }

    public double totalWeightOfFlight(Flight flight){
//        ArrayList<Passenger> passengers = flight.getPassengers();
        double result = 0.0;
        //KILOS ESTIPULATED HERE!!!
        for(Passenger passenger : flight.getPassengers() ){
            result += passenger.getNumberOfBags() * 20;
        }

        return result;

    }

    public double overAllWeightRemaining(Flight flight){
        double totalWeight = flight.getPlane().getWeight()/2;
        double usedWeight = totalWeightOfFlight(flight);

        return totalWeight - usedWeight;
    }
}
