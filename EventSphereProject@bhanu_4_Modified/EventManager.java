
import java.util.*;

public class EventManager {
    List<Event> events = new ArrayList<>();
    List<Attendee> attendees = new ArrayList<>();
    List<Vendor> vendors = new ArrayList<>();
    int eventCounter = 1;

    public void createEvent(String name, String date) {
        Event e = new Event(eventCounter++, name, date);
        events.add(e);
        System.out.println("Event Created!");
    }

    public void viewEvents() {
        for (Event e : events) {
            System.out.println(e);
        }
    }

    public void addAttendee(int eventId, String name) {
        attendees.add(new Attendee(eventId, name));
        System.out.println("Attendee Added!");
    }

    public void viewAttendees() {
        for (Attendee a : attendees) {
            System.out.println(a);
        }
    }

    public void addVendor(String name) {
        vendors.add(new Vendor(name));
        System.out.println("Vendor Added!");
    }

    public void viewVendors() {
        for (Vendor v : vendors) {
            System.out.println(v);
        }
    }
}
