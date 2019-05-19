package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String str_1 = "JAVAA";
		char [] strArray = str_1.toCharArray();
		Set<Character> uniqueSet = new HashSet<Character>();
		
		for(char c: strArray) {
			uniqueSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		
		for(Character character: uniqueSet) {
			sb.append(character);
		}
		
		System.out.println(sb.toString());
		
	}

}
