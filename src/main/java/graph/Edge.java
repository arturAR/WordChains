package graph;

public class Edge {
	
	private Node firstNode;
	private Node secondNode;
	private final int weight = 1;
	
	public Edge(Node firstNode, Node secondNode) {
		this.firstNode = firstNode;
		this.secondNode = secondNode;
	}
	
	public Node getFirstNode() {
		return firstNode;
	}

	public Node getSecondNode() {
		return secondNode;
	}

	public int getWeight() {
		return weight;
	}

	public String toString() {
        return firstNode + " <------> " +  secondNode;
    }
}
