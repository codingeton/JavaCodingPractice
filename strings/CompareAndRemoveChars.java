package strings;

public class CompareAndRemoveChars {
	
	public static void removeChars(String str_1, String str_2) {
		
		str_1 = str_1.toLowerCase();
		str_2 = str_2.toLowerCase();
		
		
		char [] strArray_1 = str_1.toCharArray();
		char [] strArray_2 = str_2.toCharArray();
		
		for(int i=0;i<strArray_1.length;i++) {
			for(int j = 0;j<strArray_2.length;j++) {
				if (strArray_1[i] == strArray_2[j]) {
					strArray_1[i] = '\0';
				}
			}
		}
		
		System.out.println(strArray_1);

		
	}

	public static void main(String[] args) {
		
		String s1 = "geeksforgeeks";
		String s2 = "mask";

		removeChars(s1,s2);
		
	}

}
