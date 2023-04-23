public class Node {

    private int x;
    private int y;
    private double cost;

    public Node(int x, int y, double cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getCost() {
        return cost;
    }

    public double getHeuristic(Node goal) {
        return Math.sqrt(Math.pow((this.x - goal.getX()), 2) + Math.pow((this.y - goal.getY()), 2));
    }

    public double getEstimatedCost(Node goal) {
        return this.getCost() + this.getHeuristic(goal);
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }


}
