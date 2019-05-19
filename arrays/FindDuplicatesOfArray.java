package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesOfArray {
	
	//1. Approach 1
	public static void findDuplicates(int[] arr){
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if(count == 1) {
					System.out.println(arr[j]);
					count =0;
				}
			}
			
		}
	}
	
	//Approach 2
	public static Set<Integer> findDuplicateInArray(int [] arr){
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for(int val: arr) {
			(unique.contains(val) ? duplicate : unique).add(val);
		}
		return duplicate;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,1,2,5,6,2};
		//findDuplicates(arr);
		System.out.println(findDuplicateInArray(arr));
	}
}
