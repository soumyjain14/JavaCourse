package test1;

public class SplitArray {
	
	public static boolean splitArray(int input[], int startIndex, int leftSum, int rightSum) {
		if(startIndex==input.length) {
			if(leftSum==rightSum) {
			return true;
			}else {
				return false;
			}
		}
		
		if(input[startIndex]%5==0) {
			leftSum=leftSum+input[startIndex];
		}
		
		else if(input[startIndex]%3==0) {
			rightSum=rightSum+input[startIndex];
		}
		else {
			return splitArray(input, startIndex+1, leftSum+input[startIndex], rightSum) || splitArray(input, startIndex+1, leftSum, rightSum+input[startIndex]);
		}
		
		return splitArray(input, startIndex+1, leftSum, rightSum);
		
		
	}
	
	public static boolean splitArray(int input[]) {
		return splitArray(input, 0, 0, 0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,4,3};
		boolean ans=splitArray(input);
		System.out.println(ans);

	}

}
