
import java.util.*;

public class BookingService {
    List<Booking> bookings = new ArrayList<>();
    int bookingCounter = 1;
    VehicleService vehicleService;

    public BookingService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void bookVehicle(int vehicleId, String name, int start, int end) {
        Vehicle v = vehicleService.getVehicle(vehicleId);

        if (v == null) {
            System.out.println("Vehicle not found!");
            return;
        }

        for (Booking b : bookings) {
            if (b.vehicleId == vehicleId &&
                !(end < b.startDay || start > b.endDay)) {
                System.out.println("Vehicle already booked for these dates!");
                return;
            }
        }

        bookings.add(new Booking(bookingCounter++, vehicleId, name, start, end));
        double total = (end - start + 1) * v.pricePerDay;

        System.out.println("Booking successful!");
        System.out.println("Total Payment: " + total);
    }

    public void showBookings() {
        for (Booking b : bookings) {
            System.out.println("Booking ID: " + b.id +
                    " | Vehicle ID: " + b.vehicleId +
                    " | Customer: " + b.customerName +
                    " | Days: " + b.startDay + "-" + b.endDay);
        }
    }
}
