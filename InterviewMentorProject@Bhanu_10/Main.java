
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuizService quizService = new QuizService();
        Map<String, User> users = new HashMap<>();

        System.out.println("=== Interview Mentor ===");

        while (true) {
            System.out.println("\n1. Start Quiz");
            System.out.println("2. View Performance");
            System.out.println("3. Remove the User");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    startQuizForUser(sc, quizService, users);
                    break;
                case 2:
                    viewPerformanceForUser(sc, users);
                    break;
                case 3:
                    removeUser(sc, users);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void startQuizForUser(Scanner sc, QuizService quizService, Map<String, User> users) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter your password: ");
        String password = sc.nextLine().trim();

        User user = users.get(name);
        if (user == null) {
            // New user
            user = new User(name, password);
            users.put(name, user);
            System.out.println("New user registered. Starting quiz...");
        } else {
            // Existing user, verify password
            if (!user.verifyPassword(password)) {
                System.out.println("Incorrect password. Access denied.");
                return;
            }
            System.out.println("Welcome back, " + name + ". Starting quiz...");
        }

        quizService.startQuiz(user.tracker);
    }

    private static void viewPerformanceForUser(Scanner sc, Map<String, User> users) {
        if (users.isEmpty()) {
            System.out.println("No users registered yet.");
            return;
        }

        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        User user = users.get(name);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Enter your password: ");
        String password = sc.nextLine().trim();

        if (!user.verifyPassword(password)) {
            System.out.println("Incorrect password. Access denied.");
            return;
        }

        System.out.println("\n=== Performance for " + name + " ===");
        user.tracker.showPerformance();
    }

    private static void removeUser(Scanner sc, Map<String, User> users) {
        if (users.isEmpty()) {
            System.out.println("No users registered yet.");
            return;
        }

        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        User user = users.get(name);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Enter your password: ");
        String password = sc.nextLine().trim();

        if (!user.verifyPassword(password)) {
            System.out.println("Incorrect password. Access denied.");
            return;
        }

        users.remove(name);
        System.out.println("User " + name + " has been removed.");
    }
}
