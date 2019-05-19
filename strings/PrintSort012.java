package strings;

import java.util.ArrayList;

public class PrintSort012 {

	public static void sort012(String str) {
		
		ArrayList<Integer> zerosList = new ArrayList<Integer>();
		ArrayList<Integer> onesList = new ArrayList<Integer>();
		ArrayList<Integer> twosList = new ArrayList<Integer>();
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		
		int zeros = 0;
		int ones = 0;
		int twos = 0;

		char[] strArray = str.toCharArray();
		
		for(int i=0;i<strArray.length;i++) {
			if(Character.isDigit(strArray[i]) && strArray[i]=='0') {
				zeros++;
				zerosList.add(0);
			} else if(Character.isDigit(strArray[i]) && strArray[i]=='1') {
				ones++;
				onesList.add(1);
			} else if(Character.isDigit(strArray[i]) && strArray[i]=='2') {
				twos++;
				twosList.add(2);
			} 
		}
		
		sortedList.addAll(zerosList);
		sortedList.addAll(onesList);
		sortedList.addAll(twosList);
		
		for(int n: sortedList) {
			System.out.print(" "+n);
		}
	}

	public static void main(String[] args) {
		String nums = "010201010100222112";
		sort012(nums);
	}
}
