import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class AStarAlgorithm {

    private Graph graph;

    public AStarAlgorithm(Graph graph) {
        this.graph = graph;
    }

    public List<Node> shortestPath(Node startNode, Node endNode) {
        Map<Node, Double> distances = new HashMap<>();
        Map<Node, Node> previousNodes = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<>(
                Comparator.comparingDouble(node -> distances.getOrDefault(node, Double.POSITIVE_INFINITY)));

        distances.put(startNode, 0.0);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode.equals(endNode)) {
                return getPath(previousNodes, endNode);
            }

            for (Node neighbor : this.graph.getNeighbors(currentNode)) {
                double tentativeDistance =
                        distances.get(currentNode) + this.graph.getWeight(currentNode, neighbor);

                if (tentativeDistance < distances.getOrDefault(neighbor, Double.POSITIVE_INFINITY)) {
                    distances.put(neighbor, tentativeDistance);
                    previousNodes.put(neighbor, currentNode);
                    queue.add(neighbor);
                }
            }
        }
        return null;
    }

    private List<Node> getPath(Map<Node, Node> previousNodes, Node endNode) {
        List<Node> path = new ArrayList<>();
        path.add(endNode);
        Node currentNode = endNode;

        while (previousNodes.containsKey(currentNode)) {
            currentNode = previousNodes.get(currentNode);
            path.add(0, currentNode);
        }

        return path;
    }

}
