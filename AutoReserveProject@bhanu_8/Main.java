
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleService vehicleService = new VehicleService();
        BookingService bookingService = new BookingService(vehicleService);

        while (true) {
            System.out.println("\n=== AutoReserve System ===");
            System.out.println("1. View Vehicles");
            System.out.println("2. Book Vehicle");
            System.out.println("3. View Bookings");
            System.out.println("4. Add Vehicle (Admin)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    vehicleService.showVehicles();
                    break;
                case 2:
                    System.out.print("Enter Vehicle ID: ");
                    int vid = sc.nextInt();
                    System.out.print("Enter Customer Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Start Day: ");
                    int start = sc.nextInt();
                    System.out.print("Enter End Day: ");
                    int end = sc.nextInt();
                    bookingService.bookVehicle(vid, name, start, end);
                    break;
                case 3:
                    bookingService.showBookings();
                    break;
                case 4:
                    System.out.print("Enter Vehicle Name: ");
                    sc.nextLine();
                    String vname = sc.nextLine();
                    System.out.print("Enter Price per Day: ");
                    double price = sc.nextDouble();
                    vehicleService.addVehicle(vname, price);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
