package tests;

import java.util.Set;

import org.junit.Test;

import model.Dictionary;
import start.WordChain;

public class FindigPathTimeTest {
	
	private String dictionaryTestPath = getClass().getClassLoader().getResource("test-dictionary.txt").getPath();
	private String dictionaryPath = getClass().getClassLoader().getResource("dictionary.txt").getPath();
	private WordChain app;
	
	@Test(timeout = 1000)
	public void shouldFindPathInOneSecondWithTestDictionary() {
		String beginWord = "aaaa";
		String endWord = "bbbb";
		
		Dictionary dict = new Dictionary();
		dict.setFileFullPath(dictionaryTestPath);
		Set<String> dictionary = dict.getDictionary(beginWord, endWord);
		app = new WordChain(beginWord, endWord);
        app.findWordChain(dictionary);
	}
	
	@Test(timeout = 1000)
	public void shouldFindPathInOneSecondWithFullDictionary() {
		String beginWord = "ruby";
		String endWord = "code";
		
		Dictionary dict = new Dictionary();
		dict.setFileFullPath(dictionaryPath);
		Set<String> dictionary = dict.getDictionary(beginWord, endWord);
		app = new WordChain(beginWord, endWord);
        app.findWordChain(dictionary);
	}
}
