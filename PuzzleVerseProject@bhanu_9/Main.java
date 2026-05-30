import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PuzzleService service = new PuzzleService();
        Leaderboard leaderboard = new Leaderboard();

        while (true) {
            System.out.println("\n=== PuzzleVerse Console ===");
            System.out.println("1. Play Puzzle");
            System.out.println("2. View Leaderboard");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                playGame(sc, service, leaderboard);
            } else if (ch == 2) {
                leaderboard.display();
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }

    private static void playGame(Scanner sc, PuzzleService service, Leaderboard leaderboard) {
        System.out.print("Enter your name: ");
        String name = sc.next();

        int totalScore = 0;
        for (int i = 1; i <= 5; i++) {
            Puzzle p = service.getRandomPuzzle();

            System.out.println("\nQuestion " + i + ": " + p.question);
            System.out.print("Your Answer: ");

            long start = System.currentTimeMillis();
            String ans = sc.next();
            long end = System.currentTimeMillis();

            boolean correct = service.validateAnswer(p, ans);
            if (!correct) {
                System.out.println("❌ Wrong Answer!");
            } else {
                int score = service.calculateScore(true, (end - start));
                totalScore += score;
                System.out.println("✅ Correct!");
            }

            System.out.println("Current Score: " + totalScore);
        }

        System.out.println("\n=== FINAL RESULT ===");
        System.out.println("Total Score: " + totalScore);
        leaderboard.addPlayer(new Player(name, totalScore));
    }
}