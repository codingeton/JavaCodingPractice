package arrays;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class RemoveElement {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,2};
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				arr = ArrayUtils.removeElement(arr, 2);
			}
			//System.out.println(arr[i]);
		}
		
		//arr = ArrayUtils.removeElement(arr, 2);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
