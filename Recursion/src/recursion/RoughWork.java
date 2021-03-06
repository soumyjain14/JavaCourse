package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RoughWork {

	public static int findUnique(int[] arr) {
		int ans=0;
		
		for(int i=0;i<arr.length;i++) {
			ans=ans&arr[i];
			if(ans==1) {
				return arr[i];
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,7,2,5,4,7,1,3,6};
		int ans=findUnique(arr);
		System.out.println(ans);

	}

}
