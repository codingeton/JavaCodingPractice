package arrays;

public class FindMissingNumber {
	
	//Add all elements in the array & subtract them from the expected sum
	//Formula : (n*(n+1)/2)

	public static void findMissingNum(int[] arr) {
		int computed_sum = 0;
		int expected_sum = (6*7)/2; //(n*n+1)/2;
		
		for(int i=0;i<arr.length;i++) {
			computed_sum += arr[i];
		}
		
		System.out.println(computed_sum);

		System.out.println(expected_sum-computed_sum);
		
	}
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,5,6};
		
		findMissingNum(nums);

	}

}
