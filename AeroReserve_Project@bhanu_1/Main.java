import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightService flightService = new FlightService();
        BookingService bookingService = new BookingService();

        while (true) {
            System.out.println("\n=== AeroReserve System ===");
            System.out.println("1. View Flights");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Bookings");
            System.out.println("4. Cancel Booking");
            System.out.println("5. User's Data");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    flightService.displayFlights();
                    break;

                case 2:
                    flightService.displayFlights();
                    System.out.print("Enter Flight ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Passenger Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    bookingService.bookTicket(id, name, flightService);
                    break;

                case 3:
                    bookingService.showBookings();
                    break;

                case 4:
                    System.out.print("Enter Booking ID to cancel: ");
                    int bid = sc.nextInt();
                    bookingService.cancelBooking(bid);
                    break;

                case 5:
                    System.out.print("Enter Passenger Name: ");
                    sc.nextLine();
                    String userName = sc.nextLine();
                    bookingService.showUserData(userName, flightService);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}