
public class PerformanceTracker {
    int totalAttempts = 0;
    int totalCorrect = 0;
    long totalTime = 0;

    public void update(int score, int total, long time) {
        totalAttempts += total;
        totalCorrect += score;
        totalTime += time;
    }

    public void showPerformance() {
        if (totalAttempts == 0) {
            System.out.println("No quiz attempts yet.");
            return;
        }

        double accuracy = (double) totalCorrect / totalAttempts * 100;

        System.out.println("Questions Attempted: " + totalAttempts);
        System.out.println("Correct Answers: " + totalCorrect);
        System.out.println("Accuracy: " + String.format("%.2f", accuracy) + "%");
        System.out.println("Total Time: " + totalTime + " seconds");
    }
}
