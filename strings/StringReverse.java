package strings;

public class StringReverse {
	
	
	//1. Method one
	public static void printReverse(String str) {
		
		char [] strArray = str.toCharArray();
		
		for(int i=0;i<strArray.length/2;i++) {
			char temp = strArray[i];
			strArray[i] = strArray[strArray.length - i -1];
			strArray[strArray.length - i -1] = temp;
		}
		System.out.println(strArray);
	}
	
	//2. Method two
	
	public static void reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		
		String s = "INDIA";
		printReverse(s);
		reverseString(s);

	}

}
