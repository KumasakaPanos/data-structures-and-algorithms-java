package number26_breadth_first_graph;

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
        target1.Neighbors.add(target2);
        target2.Neighbors.add(target1);
    }

    void add(GraphNode newNode, ArrayList<GraphNode> Target) {
        while (!Target.isEmpty()) {
            if(!Target.isEmpty()) {
                GraphNode temp = Target.remove(0);
                temp.Neighbors.add(newNode);
                newNode.Neighbors.add(temp);
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
        for(GraphNode beingProcessed : currNode.Neighbors){
            returnVal = Traversal(beingProcessed, returnVal);
        }
        return returnVal;
    }
}
