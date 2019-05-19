package arrays;

public class MaxSumOfSubArray {
	
	public static int maxSubArraySum(int[] arr) {
		int maxSum = 0;
		int curSum = 0;
		for(int num: arr) {
			curSum += num;
			maxSum = Math.max(maxSum, curSum);
			curSum = Math.max(curSum, 0);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,-10};
		System.out.println(maxSubArraySum(arr));

	}

}
