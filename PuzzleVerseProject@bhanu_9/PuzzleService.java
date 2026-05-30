
import java.util.*;

public class PuzzleService {
    List<Puzzle> puzzles = new ArrayList<>();
    Random rand = new Random();

    public PuzzleService() {
        puzzles.add(new Puzzle("2+2=?", "4", "Easy"));
        puzzles.add(new Puzzle("5*6=?", "30", "Easy"));
        puzzles.add(new Puzzle("Square root of 81?", "9", "Medium"));
        puzzles.add(new Puzzle("12*12=?", "144", "Medium"));
        puzzles.add(new Puzzle("What is 2^10?", "1024", "Hard"));
    }

    public Puzzle getRandomPuzzle() {
        return puzzles.get(rand.nextInt(puzzles.size()));
    }

    public boolean validateAnswer(Puzzle p, String ans) {
        return p.answer.equalsIgnoreCase(ans);
    }

    public int calculateScore(boolean correct, long time) {
        if (!correct) return 0;
        return (int)(1000 / (time/100 + 1));
    }
}
