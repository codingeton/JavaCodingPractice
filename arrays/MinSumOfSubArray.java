package arrays;

public class MinSumOfSubArray {
	
	public static int minSubArraySum(int[] arr) {
		int minSum = 0;
		int curSum = 0;
		for(int num: arr) {
			curSum += num;
			//System.out.println("Current sum in this iter::"+curSum);
			minSum = Math.min(minSum, curSum);
			//System.out.println("Min sum in this iter::"+minSum);
			curSum = Math.min(curSum, 0);
		}
		return minSum;
	}

	public static void main(String[] args) {
		
		int [] arr = {3, -4, 2, -3, -1, 7, -5};
		System.out.println(minSubArraySum(arr));

	}

}
