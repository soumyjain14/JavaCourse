package leetcode;

public class MaximumSubArray {

	public static int maxSum(int arr[]) {
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			currSum+=arr[i];
			if(currSum>maxSum) {
				maxSum=currSum;
			}
			if(currSum<0) {
				currSum=0;
			}

		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,-8};
		System.out.println(maxSum(arr));

	}

}
