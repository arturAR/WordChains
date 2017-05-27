package start;

import java.util.LinkedList;
import java.util.Set;

import graph.Node;

public class WordChain {
	
	private String beginWord;
	private String endWord;

	public WordChain(String beginWord, String endWord) {
		this.beginWord = beginWord;
		this.endWord = endWord;
	}
	
	public void findWordChain(Set<String> dictionary) {
		WordChainsGraph graph = new WordChainsGraph(dictionary);
		WordChainsAlgorithm my = new WordChainsAlgorithm(graph.getGraph());
		my.execute(graph.getGraph().getNodeByWord(beginWord));
		LinkedList<Node> path = my.getPath(graph.getGraph().getNodeByWord(endWord));
		if(path == null) {
			System.out.println("Should not happen");
			return;
		}
		System.out.println("\nPath from: " + beginWord + " to: " + endWord);
		for(Node node: path) {
			System.out.println("		" + node);
		}
	}
}
