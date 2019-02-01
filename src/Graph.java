import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Graph {
    private ArrayList<LinkedList<Connection>>connections;

    public LinkedList<Connection> getConnections(int node)
    {
        return connections.get(node);
    }
    public void addConnection(Connection connection)
    {
        connections.get(connection.getFromNode()).add(connection);
    }

}
