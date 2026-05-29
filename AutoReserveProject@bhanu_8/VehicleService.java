
import java.util.*;

public class VehicleService {
    List<Vehicle> vehicles = new ArrayList<>();
    int vehicleCounter = 1;

    public VehicleService() {
        vehicles.add(new Vehicle(vehicleCounter++, "Car", 1000));
        vehicles.add(new Vehicle(vehicleCounter++, "Bike", 500));
    }

    public void addVehicle(String name, double price) {
        vehicles.add(new Vehicle(vehicleCounter++, name, price));
        System.out.println("Vehicle added successfully!");
    }

    public void showVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println("ID: " + v.id + " | " + v.name + " | Price: " + v.pricePerDay);
        }
    }

    public Vehicle getVehicle(int id) {
        for (Vehicle v : vehicles) {
            if (v.id == id) return v;
        }
        return null;
    }
}
