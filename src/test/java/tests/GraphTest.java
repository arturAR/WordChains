package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Dictionary;
import start.WordChainsGraph;

public class GraphTest {
	
	private String dictionaryPath = "D:/progs/workspaceEclipse/WordChains/src/test/resources/test-dictionary.txt";
	
	@Test
	public void amountOfNodesShouldBeEqualsAmountOfWordsInDictionary() {
		String beginWordInDictionary = "aaaa";
		String endWordInDictionary = "bbbb";
		Dictionary dictionary = new Dictionary();
		dictionary.setFileFullPath(dictionaryPath);
		WordChainsGraph graph = new WordChainsGraph(dictionary.getDictionary(beginWordInDictionary, endWordInDictionary));
		assertEquals(graph.getNodes().size(), dictionary.getAmountOfWordsInDictionary());
	}
	
	@Test
	public void amountOfNodesShouldBeGreaterThanAmountOfWordsInDictionary() {
		String beginWordInDictionary = "accc";
		String endWordInDictionary = "cccc";
		Dictionary dictionary = new Dictionary();
		dictionary.setFileFullPath(dictionaryPath);
		WordChainsGraph graph = new WordChainsGraph(dictionary.getDictionary(beginWordInDictionary, endWordInDictionary));
		assertTrue(graph.getNodes().size() > dictionary.getAmountOfWordsInDictionary());
	}
	
	@Test
	public void amountOfNodesShouldBeEquals11() {
		String beginWordInDictionary = "accc";
		String endWordInDictionary = "cccc";
		Dictionary dictionary = new Dictionary();
		dictionary.setFileFullPath(dictionaryPath);
		WordChainsGraph graph = new WordChainsGraph(dictionary.getDictionary(beginWordInDictionary, endWordInDictionary));
		assertEquals(graph.getNodes().size(), 11);
	}
	
}
