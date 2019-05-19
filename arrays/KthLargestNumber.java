package arrays;

import java.util.Arrays;

public class KthLargestNumber {

	public static void kthlargestnum(int[] arr, int k) {
		
		Arrays.sort(arr);
		
		int largest = arr[arr.length-k];
		
		System.out.println(largest);
		
	}
	
	public static void main(String[] args) {
		int [] arr = {12, 3, 5, 7, 19};
		int k = 2;
		
		kthlargestnum(arr, k);

	}

}
