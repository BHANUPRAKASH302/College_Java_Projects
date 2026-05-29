
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventManager manager = new EventManager();

        while (true) {
            System.out.println("\n==== EventSphere System ====");
            System.out.println("1. Create Event");
            System.out.println("2. View Events");
            System.out.println("3. Add Attendee");
            System.out.println("4. View Attendees");
            System.out.println("5. Add Vendor");
            System.out.println("6. View Vendors");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Event Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    manager.createEvent(name, date);
                    break;
                case 2:
                    manager.viewEvents();
                    break;
                case 3:
                    System.out.print("Enter Event ID: ");
                    int eid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Attendee Name: ");
                    String aname = sc.nextLine();
                    manager.addAttendee(eid, aname);
                    break;
                case 4:
                    manager.viewAttendees();
                    break;
                case 5:
                    System.out.print("Enter Vendor Name: ");
                    String vname = sc.nextLine();
                    manager.addVendor(vname);
                    break;
                case 6:
                    manager.viewVendors();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
