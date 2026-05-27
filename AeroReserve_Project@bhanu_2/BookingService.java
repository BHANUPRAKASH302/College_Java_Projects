import java.util.*;

public class BookingService {
    List<Booking> bookings = new ArrayList<>();
    int bookingCounter = 1;

    public void bookTicket(int flightId, String name, FlightService flightService) {
        Flight f = flightService.getFlight(flightId);

        if (f == null) {
            System.out.println("Flight not found!");
            return;
        }

        if (f.seats <= 0) {
            System.out.println("No seats available!");
            return;
        }

        Booking b = new Booking(bookingCounter++, name, flightId);
        bookings.add(b);
        f.seats--;

        System.out.println("Booking successful! Booking ID: " + b.bookingId);
    }

    public void showBookings() {
        System.out.println("\nBookings:");
        for (Booking b : bookings) {
            System.out.println("Booking ID: " + b.bookingId +
                    " | Name: " + b.passengerName +
                    " | Flight ID: " + b.flightId);
        }
    }

    public void cancelBooking(int bookingId) {
        Iterator<Booking> it = bookings.iterator();

        while (it.hasNext()) {
            Booking b = it.next();
            if (b.bookingId == bookingId) {
                it.remove();
                System.out.println("Booking cancelled!");
                return;
            }
        }
        System.out.println("Booking not found!");
    }

    public void showUserData(String passengerName, FlightService flightService) {
        System.out.println("\nUser Data for: " + passengerName);
        boolean found = false;
        
        for (Booking b : bookings) {
            if (b.passengerName.equalsIgnoreCase(passengerName)) {
                Flight f = flightService.getFlight(b.flightId);
                System.out.println("Booking ID: " + b.bookingId +
                        " | Flight: " + f.source + " -> " + f.destination +
                        " | Flight ID: " + b.flightId);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No bookings found for this user.");
        }
    }
}