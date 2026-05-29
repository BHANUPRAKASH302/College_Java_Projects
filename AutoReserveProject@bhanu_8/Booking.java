
public class Booking {
    int id;
    int vehicleId;
    String customerName;
    int startDay;
    int endDay;

    public Booking(int id, int vehicleId, String customerName, int startDay, int endDay) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.customerName = customerName;
        this.startDay = startDay;
        this.endDay = endDay;
    }
}
