import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DebateService service = new DebateService();

        while (true) {
            System.out.println("\n=== Debate Hub ===");
            System.out.println("1. Create Debate");
            System.out.println("2. View Debates");
            System.out.println("3. Join Debate");
            System.out.println("4. Vote");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter topic: ");
                    String topic = sc.nextLine();
                    service.createDebate(topic);
                    break;

                case 2:
                    service.viewDebates();
                    break;

                case 3:
                    System.out.print("Enter debate ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter your argument: ");
                    String arg = sc.nextLine();
                    service.addArgument(id, arg);
                    break;

                case 4:
                    System.out.print("Enter debate ID: ");
                    int did = sc.nextInt();
                    service.vote(did);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
