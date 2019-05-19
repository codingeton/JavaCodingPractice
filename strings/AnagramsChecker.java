package strings;

import java.util.Arrays;

public class AnagramsChecker {
	
	public static void areAnagrams(String s1, String s2) {
		
		boolean result = false;
		
		if(s1.length()!=s2.length()) {
			result = false;
		} else {
			char [] strArray1 = s1.toLowerCase().toCharArray();
			char [] strArray2 = s2.toLowerCase().toCharArray();
			Arrays.sort(strArray1);
			Arrays.sort(strArray2);
			result = Arrays.equals(strArray1, strArray2);
		}
		
		if(result) {
			System.out.println("Two strings are anagrams");
		} else {
			System.out.println("Two strings are not anagrams");
		}
	}

	public static void main(String[] args) {
		
		String s1 = "keep";
		String s2 = "peek";
		areAnagrams(s1, s2);

	}

}
