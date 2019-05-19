package arrays;

public class MaxNumber {

	public static void main(String[] args) {
		int [] arr = {10,8,1,7,11};
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
