public class Connection {
    private int fromNode;
    private int toNode;
    private Move cost;

    public Connection(int fromNode, int toNode, Move cost) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.cost = cost;
    }

    public Move getCost() {
        return cost;
    }

    public int getFromNode() {
        return fromNode;
    }

    public int getToNode() {
        return toNode;
    }
}
