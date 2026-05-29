import java.util.*;

class Debate {
    int id;
    String topic;
    List<String> arguments = new ArrayList<>();
    int votes = 0;

    Debate(int id, String topic) {
        this.id = id;
        this.topic = topic;
    }
}
