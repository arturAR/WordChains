package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {
	
	private int amountOfWordsInDictionary = 0;
	private String fileFullPath;

	public Set<String> getDictionary(String beginWord, String endWord) {
        int stringLength = beginWord.length();
        Set<String> dictionary = new HashSet<String>();
        dictionary.add(beginWord);
        dictionary.add(endWord);
        String fileName = getFileFullPath();
        try {
            FileReader inputFile = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(inputFile);
            String line;
            while (((line = bufferReader.readLine()) != null)) {
            	if(line.length() == stringLength) {
	            	dictionary.add(line.toLowerCase());
	            	amountOfWordsInDictionary++;
	            	//System.out.println(line.toLowerCase());
            	}
            }
            bufferReader.close();
        } catch(Exception e) {
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }
        return dictionary;
    }

	
    public int getAmountOfWordsInDictionary() {
		return amountOfWordsInDictionary;
	}
    
	public String getFileFullPath() {
		return fileFullPath;
	}

	public void setFileFullPath(String fileFullPath) {
		this.fileFullPath = fileFullPath;
	}
}
