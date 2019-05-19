package arrays;

import java.util.HashMap;


public class CountIntegerOccurrences {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 2, 3, 4, 5, 3 };
		
		int count=0;

		HashMap<Integer, Integer> eleMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (eleMap.get(arr[i]) == null) {
				eleMap.put(arr[i],1);
			} else {
				count = eleMap.get(arr[i]);
				count++;
				eleMap.put(arr[i],count);
			}
		}
		System.out.println(eleMap);
	}
}
