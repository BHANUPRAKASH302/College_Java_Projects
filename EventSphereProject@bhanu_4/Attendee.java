
public class Attendee {
    int eventId;
    String name;

    public Attendee(int eventId, String name) {
        this.eventId = eventId;
        this.name = name;
    }

    public String toString() {
        return "Event ID: " + eventId + " | Name: " + name;
    }
}
