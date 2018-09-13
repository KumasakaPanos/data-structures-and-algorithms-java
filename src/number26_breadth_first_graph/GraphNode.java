package number26_breadth_first_graph;

import java.util.LinkedList;

public class GraphNode {
    int data;
    LinkedList<GraphNode> Neighbors;
    void addNeighbor(GraphNode newNode){
        this.Neighbors.add(newNode);
    }
    GraphNode(int data){
        this.data = data;
        this.Neighbors = new LinkedList<GraphNode>();
    }
}
