import java.util.*;

class Flight {
    int arrivalTime;
    int departureTime;
    
    // Constructor
    public Flight(int arrivalTime, int departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
}

public class AirportScheduling {
    
    // Method to schedule flights using Greedy Algorithm
    public static void scheduleFlights(List<Flight> flights) {
        // Sort flights by arrival time
        Collections.sort(flights, (f1, f2) -> Integer.compare(f1.arrivalTime, f2.arrivalTime));
        
        // List to hold the scheduled flights
        List<Flight> scheduledFlights = new ArrayList<>();
        
        // Greedy selection: Schedule the first flight
        Flight previousFlight = null;
        
        for (Flight flight : flights) {
            if (previousFlight == null || flight.arrivalTime >= previousFlight.departureTime) {
                // No conflict, so schedule the flight
                scheduledFlights.add(flight);
                previousFlight = flight;
            }
        }
        
        // Print the scheduled flights
        System.out.println("Scheduled Flights (Arrival - Departure):");
        for (Flight flight : scheduledFlights) {
            System.out.println(flight.arrivalTime + " - " + flight.departureTime);
        }
    }
    
    public static void main(String[] args) {
        // Example flight times
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight(1, 2));
        flights.add(new Flight(1, 3));
        flights.add(new Flight(2, 4));
        flights.add(new Flight(3, 4));
        
        // Schedule flights
        scheduleFlights(flights);
    }
}
