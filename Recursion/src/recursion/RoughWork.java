package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RoughWork {

	public static void rotate(int[] arr, int d) {
		int temp=Integer.MIN_VALUE;
		int j=arr.length-1;
		for(int i=0;i<(arr.length/2);i++) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
			
		}
		j=arr.length-d-1;
		for(int i=0;i<((arr.length-d)/2);i++) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
			
		}
		
		j=arr.length-1;
		for(int i=((arr.length-d));i<(arr.length-1)-1;i++) {
			if(j>=i) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,6,11,12,17,22,26,30,33,38};
		int d=7;
		rotate(arr, d);

	}

}
