package arrays;

import java.util.Arrays;

public class KthSmallestNumber {

	public static void kthSmallestOfArr(int[] arr, int k) {
		
		Arrays.sort(arr);
		
		int smallest = arr[k-1];
		
		System.out.println(smallest);
		
	}
	
	public static void main(String[] args) {
		
		int [] arr = {12, 3, 5, 7, 19};
		int k = 2;
		
		kthSmallestOfArr(arr, k);

	}

}
