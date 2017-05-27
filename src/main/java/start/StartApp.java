package start;

import java.util.Scanner;
import java.util.Set;

import model.Dictionary;

public class StartApp {
	
	private static String beginWord = "";
	private static String endWord = "";
	private static String dictionaryPath = StartApp.class.getClassLoader().getResource("dictionary.txt").getPath();

	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		dict.setFileFullPath(dictionaryPath);
		
        boolean sameLength = false;
        while(!sameLength) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the starting word: ");
            beginWord = getWord(in);
            System.out.println("Please enter the target word: ");
            endWord = getWord(in);
            if(beginWord.length() == endWord.length()) {
            	sameLength = true;
            } else {
            	System.out.println("Error: words are not the same length");
            }
        }
        Set<String> dictionary = dict.getDictionary(beginWord, endWord);
        
        WordChain app = new WordChain(beginWord, endWord);
        app.findWordChain(dictionary);
	}
	
    public static String getWord(Scanner in) {
        String word = in.next();
        return word;
    }
    
}
