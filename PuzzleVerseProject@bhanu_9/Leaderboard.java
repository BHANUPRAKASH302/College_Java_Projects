
import java.util.*;

public class Leaderboard {
    List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void display() {
        players.sort((a, b) -> b.score - a.score);
        System.out.println("\n=== Leaderboard ===");
        for (Player p : players) {
            System.out.println(p.name + " - " + p.score);
        }
    }
}
