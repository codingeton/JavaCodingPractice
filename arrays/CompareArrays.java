package arrays;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3};
		int [] arr2 = {1,20,3};
		
		boolean equal = Arrays.equals(arr1, arr2);
		
		System.out.println(equal);
	}

}
