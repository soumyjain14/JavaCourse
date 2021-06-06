package leetcode;

public class MaximumSubArray {

	public static int maxSum(int arr[]) {
		int currSum=1;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(currSum==0) {
				currSum=arr[i];
			}else {
				currSum*=arr[i];
			}
			if(currSum>maxSum) {
				maxSum=currSum;
			}

		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,-1,4,5};
		System.out.println(maxSum(arr));

	}

}
