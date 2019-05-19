package arrays;

import java.util.Arrays;

public class FindElement {

	public static void main(String[] args) {
		int [] arr_1 = {10,2,13,7};
		int ele = 13;
		//boolean found = Arrays.stream(arr_1).anyMatch(x->ele.equals(x));
		boolean found = Arrays.stream(arr_1).anyMatch(x -> ele == x);
		int position = Arrays.binarySearch(arr_1, ele);
		System.out.println(position);
		System.out.println(found);
/*		boolean found = false;
		for(int i=0;i<arr_1.length;i++) {
			if(arr_1[i]==ele) {
				found = true;
				break;
			} 
		}
		if(found == true) {
			System.out.println(ele+" Number found in the array");
		} else {
			System.out.println("Number not found");
		}*/
 	}
	

}
