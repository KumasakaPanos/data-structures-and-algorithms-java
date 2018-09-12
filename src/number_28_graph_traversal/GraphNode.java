package number_28_graph_traversal;

import java.util.LinkedList;

public class GraphNode {
    int data;
    LinkedList<Edge> Edges;
    void addNeighbor(GraphNode newNode){this.Edges.add(new Edge(this,newNode,0));}
    void addNeighbor(GraphNode newNode, int data){this.Edges.add(new Edge(this,newNode,data));}
    GraphNode(int data){
        this.data = data;
        this.Edges = new LinkedList<Edge>();
    }
}
