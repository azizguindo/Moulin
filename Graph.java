import java.util.ArrayList;

public class Graph {

    public ArrayList<Node> nodes;

    public Graph(){
        this.nodes= new ArrayList<>(24);
    }

    public void add(Node node){
        this.nodes.add(node);
    }

    public Connection[] getConnections(Node node){
        return node.getConnections();
    }
}
