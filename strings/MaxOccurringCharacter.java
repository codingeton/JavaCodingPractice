package strings;

import java.util.HashMap;

public class MaxOccurringCharacter {
	
	public static void maxOccuringChar(String str) {
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		char [] strArray = str.toCharArray();
		
		for(char ch: strArray) {
			
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1 );
			} else {
				charMap.put(ch, 1);
			}
		}
		
		System.out.println(charMap);
		
	}
		
	public static void main(String[] args) {
		
		String str = "aabcbbb";
		maxOccuringChar(str);

	}

}
