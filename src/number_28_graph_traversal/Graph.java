package number_28_graph_traversal;

import java.util.ArrayList;

public class Graph {
    GraphNode root;

    void add(int input, GraphNode Target) {
        GraphNode newNode = new GraphNode(input);
        ArrayList tempList = new ArrayList();
        tempList.add(Target);
        add(newNode, tempList);
    }
    void addEdge(GraphNode target1, GraphNode target2){
        Edge tempEdge = new Edge(target1,target2,0);
        target1.Edges.add(tempEdge);
        target2.Edges.add(tempEdge);
    }

    void add(GraphNode newNode, ArrayList<GraphNode> Target) {
        while (!Target.isEmpty()) {
            if(!Target.isEmpty()) {
                GraphNode currNode = Target.remove(0);
                Edge temp = new Edge(newNode,currNode,0);
                newNode.Edges.add(temp);
                currNode.Edges.add(temp);
            }
        }
    }

    public ArrayList<GraphNode> BreadthFirstTraversal(GraphNode targetNode){
        ArrayList<GraphNode> returnVal = new ArrayList<GraphNode>();
        return Traversal(targetNode,returnVal);
    }

    private ArrayList<GraphNode> Traversal(GraphNode currNode, ArrayList returnVal){
        if(returnVal.contains(currNode)){
            return returnVal;
        }
        returnVal.add(currNode);
        for(Edge beingProcessed : currNode.Edges){
            for(GraphNode rightEnd : beingProcessed.nodes) {
                if(!rightEnd.equals(currNode)) {
                    returnVal = Traversal(rightEnd, returnVal);
                }
            }
        }
        return returnVal;
    }
}
