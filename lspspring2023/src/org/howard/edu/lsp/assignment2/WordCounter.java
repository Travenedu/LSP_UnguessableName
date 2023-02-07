/*
 * Traven Reese
 */

package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;

public class WordCounter {

	public static void main(String[] args) throws IOException {
		
		try {
		
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//"main/java/resources/word.txt"
		BufferedReader reader = new BufferedReader(new FileReader("lspspring2023/src/main/java/resources/word.txt"));
		String line;
		Boolean numeric = true;
		
		while((line = reader.readLine()) != null) {
			String[] words = line.split("\\s+");
			
			for (String word : words) {
				word = word.toLowerCase();
				
				if(numeric == false){
					if (wordCount.containsKey(word)){
					
						wordCount.put(word, wordCount.get(word) + 1); 
						
					} else {
						
						wordCount.put(word, 1);
					}	
				}

			}
			
			
			}
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println( entry.getKey() + ": " + entry.getValue());
		}
		
		reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resources");
	}

}
}