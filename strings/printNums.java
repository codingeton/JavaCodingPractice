package strings;

public class printNums {
	
	public static void printDifferentNums(String str) {
			
		int zeros = str.length() - str.replaceAll("0", "").length();
		int ones = str.length() - str.replaceAll("1", "").length();
		int twos = str.length() - str.replaceAll("2", "").length();
		
		System.out.println(zeros);
		System.out.println(ones);
		System.out.println(twos);
	}

	public static void main(String[] args) {
		
		String nums = "0102";
		printDifferentNums(nums);

	}

}
