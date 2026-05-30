
public class Event {
    int id;
    String name;
    String date;

    public Event(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Date: " + date;
    }
}
