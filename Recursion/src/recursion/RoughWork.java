package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RoughWork {
	
	public static int pairSum(int[] arr,int startIndex, int num) {
		if(startIndex==arr.length-1) {
			return 0;
		}
		
		int smallAns=pairSum(arr, startIndex+1, num-arr[startIndex]);
		int smallAns1=pairSum(arr, startIndex+1, num);
		return smallAns+smallAns1;
		
	}

	public static int pairSum(int[] arr, int num) {
		return pairSum(arr, 0, num);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {2,8,10,5,-2,5};
		int num=10;
		int ans=pairSum(input, num);
		System.out.println(ans);


	}

}
