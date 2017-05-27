package start;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import graph.Edge;
import graph.Graph;
import graph.Node;

public class WordChainsGraph {
	
	private Set<String> dictionary;
	private Graph graph;
	private List<Node> nodes;
	private List<Edge> edges;

	public WordChainsGraph(Set<String> dictionary) {
		this.dictionary = dictionary;
		nodes = new ArrayList<Node>();
		edges = new ArrayList<Edge>();
		createGraph();
	}
	
	public void createGraph() {
		createNodes();
		createEdges();
		graph = new Graph(nodes, edges);
	}

	private void createNodes() {
    	int nodeId = 1;
    	Node node = null;
		for(String word: dictionary) {
			node = new Node(nodeId, word);
			nodes.add(node);
			nodeId++;
		}
	}
	
    private void createEdges() {
    	Edge edge = null;
		for(int i = 0; i < nodes.size() ; i++) {
			for(int j = i; j < nodes.size() ; j++) {
				Node thisNode = nodes.get(i);
				Node nextNode = nodes.get(j);
				if(isNeighbour(thisNode.getWord(), nextNode.getWord())) {
					edge = new Edge(thisNode, nextNode);
					edges.add(edge);
				}
			}
		}
	}
    
    private boolean isNeighbour(String thisNode, String nextNode) {
    	char thisChars[] = thisNode.toCharArray();
    	char nextChars[] = nextNode.toCharArray();
    	int cnt = 0;
    	for(int i = 0; i < thisChars.length ; i++) {
    		if(thisChars[i] != nextChars[i]) {
    			cnt++;
    		}
    	}
    	if(cnt == 1) {
    		return true;
    	}
    	return false;
    }
	
	public Graph getGraph() {
		return graph;
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public List<Edge> getEdges() {
		return edges;
	}
}
