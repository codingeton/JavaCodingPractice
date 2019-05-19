package strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
	
	public static void printDuplicateWords(String str) {
		
		String[] words = str.split("\\s+");
		
		Set<String> set = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		
		for(String word: words) {
			if(!set.add(word)) {
				duplicates.add(word);
			}
		}
		System.out.println(duplicates);
		
	}

	public static void main(String[] args) {
		
		String input = "This sentence contains two words, one and two";
		printDuplicateWords(input);
	}

}
