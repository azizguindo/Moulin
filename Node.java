import java.util.ArrayList;

public class Node {

    private Connection[] connections;
    private String id;

    public Node(String id) {
        this.id = id;
    }

    public Connection[] getConnections() {
        return connections;
    }

    public String getId() {
        return id;
    }
}
