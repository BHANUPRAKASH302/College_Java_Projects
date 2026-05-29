import java.util.*;

class DebateService {
    List<Debate> debates = new ArrayList<>();
    int counter = 1;

    void createDebate(String topic) {
        debates.add(new Debate(counter++, topic));
        System.out.println("Debate created!");
    }

    void viewDebates() {
        if (debates.isEmpty()) {
            System.out.println("No debates available.");
            return;
        }

        for (Debate d : debates) {
            System.out.println("ID: " + d.id + " | Topic: " + d.topic + " | Votes: " + d.votes);
            for (String arg : d.arguments) {
                System.out.println(" - " + arg);
            }
        }
    }

    void addArgument(int id, String argument) {
        for (Debate d : debates) {
            if (d.id == id) {
                d.arguments.add(argument);
                System.out.println("Argument added!");
                return;
            }
        }
        System.out.println("Debate not found.");
    }

    void vote(int id) {
        for (Debate d : debates) {
            if (d.id == id) {
                d.votes++;
                System.out.println("Vote added!");
                return;
            }
        }
        System.out.println("Debate not found.");
    }
}
