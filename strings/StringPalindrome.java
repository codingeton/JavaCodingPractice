package strings;

public class StringPalindrome {
	
	public static void isPalindrome(String str) {
		String temp = str;
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reversed = sb.toString();
//		System.out.println("Original string::"+str);
//		System.out.println("Temp string::"+temp);
//		System.out.println("Reversed string::"+reversed);
		if(temp.equals(reversed)) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		isPalindrome("151");
		isPalindrome("abc");
		isPalindrome("bbb");
	}

}
