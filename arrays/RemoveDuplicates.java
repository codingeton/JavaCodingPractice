package arrays;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
	
	public static HashSet<Integer> removeDuplicates(int[] arr) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Array after removing duplicates::");
		return s;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,1,2,5,6,2};
		System.out.println(removeDuplicates(arr));

	}
}
