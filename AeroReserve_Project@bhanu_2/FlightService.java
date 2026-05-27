import java.util.*;

public class FlightService {
    List<Flight> flights = new ArrayList<>();

    public FlightService() {
        flights.add(new Flight(1, "Hyderabad", "Delhi", 5));
        flights.add(new Flight(2, "Mumbai", "Chennai", 3));
        flights.add(new Flight(3, "Bangalore", "Kolkata", 4));
    }

    public void displayFlights() {
        System.out.println("\nAvailable Flights:");
        for (Flight f : flights) {
            System.out.println("ID: " + f.id + " | " + f.source + " -> " + f.destination + " | Seats: " + f.seats);
        }
    }

    public Flight getFlight(int id) {
        for (Flight f : flights) {
            if (f.id == id) return f;
        }
        return null;
    }
}