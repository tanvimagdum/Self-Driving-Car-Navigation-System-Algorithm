import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();
    private Map<Node, List<Node>> edges = new HashMap<>();
    private Map<String, Integer> traffic = new HashMap<>();

    public void addNodes(Node... nodes) {
        for (Node node : nodes) {
            this.nodes.add(node);
        }
    }

    public void addEdge(Node source, Node destination, double weight) {
        if (!this.edges.containsKey(source)) {
            this.edges.put(source, new ArrayList<>());
        }
        this.edges.get(source).add(destination);
    }

    public void setTraffic(Node source, Node destination, int level) {
        String key = source.toString() + "->" + destination.toString();
        this.traffic.put(key, level);
    }

    public int getTraffic(Node source, Node destination) {
        String key = source.toString() + "->" + destination.toString();
        if (this.traffic.containsKey(key)) {
            return this.traffic.get(key);
        } else {
            return 0;
        }
    }

    public List<Node> getNeighbors(Node node) {
        if (!this.edges.containsKey(node)) {
            return Collections.emptyList();
        }
        return this.edges.get(node);
    }

    public double getWeight(Node source, Node destination) {
        return source.getCost() + this.getTraffic(source, destination);
    }


}
