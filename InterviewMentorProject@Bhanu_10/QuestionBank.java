
import java.util.*;

public class QuestionBank {
    public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();

        list.add(new Question(
            "What is the time complexity of binary search?",
            new String[]{"O(n)", "O(log n)", "O(n log n)", "O(1)"},
            1,
            "Binary search halves the search space each time.",
            "DSA"
        ));

        list.add(new Question(
            "Which scheduling algorithm uses shortest job first?",
            new String[]{"FCFS", "SJF", "Round Robin", "Priority"},
            1,
            "SJF selects process with shortest burst time.",
            "OS"
        ));

        list.add(new Question(
            "Which keyword is used for inheritance in Java?",
            new String[]{"this", "super", "extends", "implements"},
            2,
            "The extends keyword is used for inheritance.",
            "Java"
        ));

        return list;
    }
}
