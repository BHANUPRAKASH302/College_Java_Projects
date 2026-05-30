
public class Question {
    String question;
    String[] options;
    int correctAnswer;
    String explanation;
    String category;

    public Question(String question, String[] options, int correctAnswer, String explanation, String category) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.explanation = explanation;
        this.category = category;
    }
}
