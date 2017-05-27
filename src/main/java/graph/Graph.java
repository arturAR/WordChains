package graph;

import java.util.List;

public class Graph {
    private final List<Node> nodes;
    private final List<Edge> edges;

    public Graph(List<Node> nodes, List<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }
    
    public void showGraphStatistic() {
    	System.out.println("Created nodes: " + nodes.size() + " , created edges: " + edges.size());
    }
    
    public Node getNodeByWord(String word) {
    	for(Node node: nodes) {
    		if(node.getWord().equals(word)) {
    			return node;
    		}
    	}
    	return null;
    }
}