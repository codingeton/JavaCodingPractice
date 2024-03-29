package strings;

public class FirstNonRepeatingChar {
	
	static final int NO_OF_CHARS = 256; 
    static char count[] = new char[NO_OF_CHARS]; 
	
	public static void getCharCountArray(String str) {
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
	}

	public static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int index = -1;
		for(int i=0; i<str.length();i++) {
			if(count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		
		String str = "geeksforgeeks"; 
        int index =  firstNonRepeating(str);
        System.out.println(str.charAt(index));

	}

}
