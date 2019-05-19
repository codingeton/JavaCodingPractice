package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	
	public static void reverse(Integer[] arr_1) {
		Collections.reverse(Arrays.asList(arr_1));
		System.out.println("Array after reverse::"+Arrays.asList(arr_1));
	}
	
	public static void reverseArray(int[] arr) {
		System.out.println("Array before reverse::");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length -1 -i] = temp;
		}
		System.out.println("\nArrays after reverse::");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	public static void main(String[] args) {
		Integer [] arr_1 = {1,2,3,4};
		int [] arr_2 = {10,2,3,4};
		reverse(arr_1);
		reverseArray(arr_2);
		//System.out.println(reverseArray(arr_2));
	}

}
