package arrays;


public class ArraysCopy {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3};
		int [] arr2 = {10,20,30};
		
		int [] combinedArray = new int[arr1.length + arr2.length];
		
		//Copy arr1 to new Array
		
		System.arraycopy(arr1, 0, combinedArray, 0, arr1.length);
		
		// Copy arr2 to new Array
		
		System.arraycopy(arr2, 0, combinedArray, arr1.length, arr2.length);
		
		for(int i=0;i<combinedArray.length;i++) {
			System.out.println(combinedArray[i]);
		}
	}

}
