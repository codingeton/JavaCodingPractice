package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		List<Integer> al = new ArrayList<>(arr.length);
	
		for (int num: arr) {
			al.add(Integer.valueOf(num));
		}
		
		System.out.println(al);

	}

}
