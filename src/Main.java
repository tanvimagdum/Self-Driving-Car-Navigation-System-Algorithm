import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create nodes for the graph
        Node n1_1 = new Node(1, 1, 1.0);
        Node n1_2 = new Node(1, 2, 1.0);
        Node n2_1 = new Node(2, 1, 1.0);
        Node n2_2 = new Node(2, 2, 1.0);
        Node n3_1 = new Node(3, 1, 1.0);
        Node n3_2 = new Node(3, 2, 1.0);
        Node n4_1 = new Node(4, 1, 1.0);
        Node n4_2 = new Node(4, 2, 1.0);
        Node n5_1 = new Node(5, 1, 1.0);
        Node n5_2 = new Node(5, 2, 1.0);
        Node n6_1 = new Node(6, 1, 1.0);
        Node n6_2 = new Node(6, 2, 1.0);
        Node n7_1 = new Node(7, 1, 1.0);
        Node n7_2 = new Node(7, 2, 1.0);
        Node n8_1 = new Node(8, 1, 1.0);
        Node n8_2 = new Node(8, 2, 1.0);
        Node n9_1 = new Node(9, 1, 1.0);
        Node n9_2 = new Node(9, 2, 1.0);
        Node n10_1 = new Node(10, 1, 1.0);
        Node n10_2 = new Node(10, 2, 1.0);
        Node n1_3 = new Node(1, 3, 1.1);
        Node n1_4 = new Node(1, 4, 1.1);
        Node n2_3 = new Node(2, 3, 1.1);
        Node n2_4 = new Node(2, 4, 1.1);
        Node n3_3 = new Node(3, 3, 1.1);
        Node n3_4 = new Node(3, 4, 1.1);
        Node n4_3 = new Node(4, 3, 1.2);
        Node n4_4 = new Node(4, 4, 1.2);
        Node n5_3 = new Node(5, 3, 1.2);
        Node n5_4 = new Node(5, 4, 1.2);
        Node n6_3 = new Node(6, 3, 1.3);
        Node n6_4 = new Node(6, 4, 1.3);
        Node n7_3 = new Node(7, 3, 1.4);
        Node n7_4 = new Node(7, 4, 1.4);
        Node n8_3 = new Node(8, 3, 1.5);
        Node n8_4 = new Node(8, 4, 1.5);
        Node n9_3 = new Node(9, 3, 1.5);
        Node n9_4 = new Node(9, 4, 1.5);
        Node n10_3 = new Node(10, 3, 1.5);
        Node n10_4 = new Node(10, 4, 1.5);

        // Add the nodes to the graph
        Graph graph = new Graph();
        graph.addNodes(n1_1, n1_2, n2_1, n2_2, n3_1, n3_2, n4_1, n4_2, n5_1, n5_2, n6_1, n6_2, n7_1,
                n7_2, n8_1, n8_2, n9_1, n9_2, n10_1, n10_2, n1_3, n1_4, n2_3, n2_4, n3_3, n3_4, n4_3, n4_4,
                n5_3, n5_4, n6_3, n6_4, n7_3, n7_4, n8_3, n8_4, n9_3, n9_4, n10_3, n10_4);

        // Add the edges to the graph
        graph.addEdge(n1_1, n1_2, 1.0);
        graph.addEdge(n1_2, n2_2, 1.0);
        graph.addEdge(n2_2, n2_1, 1.0);
        graph.addEdge(n2_1, n3_1, 1.0);
        graph.addEdge(n3_1, n3_2, 1.0);
        graph.addEdge(n3_2, n4_2, 1.0);
        graph.addEdge(n4_2, n4_1, 1.0);
        graph.addEdge(n4_1, n5_1, 1.0);
        graph.addEdge(n5_1, n5_2, 1.0);
        graph.addEdge(n5_2, n6_2, 1.0);
        graph.addEdge(n6_2, n6_1, 1.0);
        graph.addEdge(n6_1, n7_1, 1.0);
        graph.addEdge(n7_1, n7_2, 1.0);
        graph.addEdge(n7_2, n8_2, 1.0);
        graph.addEdge(n8_2, n8_1, 1.0);
        graph.addEdge(n8_1, n9_1, 1.0);
        graph.addEdge(n9_1, n9_2, 1.0);
        graph.addEdge(n9_2, n10_2, 1.0);
        graph.addEdge(n1_1, n1_3, 1.1);
        graph.addEdge(n1_3, n2_3, 1.1);
        graph.addEdge(n2_3, n2_4, 1.1);
        graph.addEdge(n2_4, n3_4, 1.1);
        graph.addEdge(n3_4, n3_3, 1.1);
        graph.addEdge(n3_3, n4_3, 1.2);
        graph.addEdge(n4_3, n4_4, 1.2);
        graph.addEdge(n4_4, n5_4, 1.2);
        graph.addEdge(n5_4, n5_3, 1.2);
        graph.addEdge(n5_3, n6_3, 1.3);
        graph.addEdge(n6_3, n6_4, 1.3);
        graph.addEdge(n6_4, n7_4, 1.3);
        graph.addEdge(n7_4, n7_3, 1.3);
        graph.addEdge(n7_3, n8_3, 1.4);
        graph.addEdge(n8_3, n8_4, 1.4);
        graph.addEdge(n8_4, n9_4, 1.4);
        graph.addEdge(n9_4, n9_3, 1.4);
        graph.addEdge(n9_3, n10_3, 1.5);
        graph.addEdge(n10_3, n10_4, 1.5);

        // Set the traffic conditions
        graph.setTraffic(n1_1, n1_2, 2);
        graph.setTraffic(n1_3, n2_3, 1);
        graph.setTraffic(n2_2, n2_1, 3);
        graph.setTraffic(n3_1, n3_2, 1);
        graph.setTraffic(n4_2, n4_1, 2);
        graph.setTraffic(n5_1, n5_2, 1);
        graph.setTraffic(n6_2, n6_1, 3);
        graph.setTraffic(n7_1, n7_2, 1);
        graph.setTraffic(n8_2, n8_1, 2);
        graph.setTraffic(n9_1, n9_2, 1);
        graph.setTraffic(n10_2, n9_2, 2);

        // Set the start and end nodes
        Node startNode = n1_1;
        Node endNode = n10_4;

        // Run the A* algorithm
        AStarAlgorithm algorithm = new AStarAlgorithm(graph);
        List<Node> path = algorithm.shortestPath(startNode, endNode);

        // Print the path
        if (path == null) {
            System.out.println("No path found.");
        } else {
            System.out.print("Path: ");
            for (Node node : path) {
                System.out.print(node + " ");
            }
        }
    }
}