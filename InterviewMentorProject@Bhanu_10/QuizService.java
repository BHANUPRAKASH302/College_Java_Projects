
import java.util.*;

public class QuizService {
    Scanner sc = new Scanner(System.in);

    public void startQuiz(PerformanceTracker tracker) {
        List<Question> questions = QuestionBank.getQuestions();
        Collections.shuffle(questions);

        int score = 0;
        long startTime = System.currentTimeMillis();

        for (Question q : questions) {
            System.out.println("\nCategory: " + q.category);
            System.out.println(q.question);

            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i+1) + ". " + q.options[i]);
            }

            System.out.print("Enter answer: ");
            int ans = sc.nextInt() - 1;

            if (ans == q.correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Explanation: " + q.explanation);
            }
        }

        long endTime = System.currentTimeMillis();
        long timeTaken = (endTime - startTime) / 1000;

        tracker.update(score, questions.size(), timeTaken);
        System.out.println("\nQuiz Completed!");
    }
}
