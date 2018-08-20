package number26_breadth_first_graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void add() {
        Graph testGraph = new Graph();
        testGraph.root=new GraphNode(0);
        testGraph.add(1,testGraph.root);
        assertEquals(testGraph.root.Neighbors.get(0).data,1);
    }

    @Test
    void add1() {
        Graph testGraph = new Graph();
        testGraph.root=new GraphNode(0);
        testGraph.add(1,testGraph.root);
        ArrayList<GraphNode> inputList = new ArrayList();
        inputList.add(testGraph.root);
        inputList.add(testGraph.root.Neighbors.peek());
        testGraph.add(new GraphNode(4),inputList);
        assertEquals(testGraph.root.data,0);
        assertEquals(testGraph.root.Neighbors.get(0).data,1);
        assertEquals(testGraph.root.Neighbors.get(1).data,4);
    }

    @Test
    void breadthFirstTraversal() {
        Graph testGraph = new Graph();
        testGraph.root=new GraphNode(0);
        testGraph.add(1,testGraph.root);
        ArrayList<GraphNode> inputList = new ArrayList();
        inputList.add(testGraph.root);
        inputList.add(testGraph.root.Neighbors.peek());
        testGraph.add(new GraphNode(4),inputList);
        ArrayList<GraphNode> testList = new ArrayList<>();
        testList.add(testGraph.root);
        testList.add(testGraph.root.Neighbors.get(0));
        testList.add(testGraph.root.Neighbors.get(1));
        assertEquals(testGraph.BreadthFirstTraversal(testGraph.root), testList);
    }
}