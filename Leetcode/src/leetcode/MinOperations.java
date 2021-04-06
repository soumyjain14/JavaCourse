package leetcode;

import java.util.Scanner;

public class MinOperations {

	public static int minOperations(int n) {
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			arr[i]=(2*i)+1;
		}
		
			for(int i=0;i<(n/2);i++) {
				count+=n-arr[i];
			}
		
		
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ans=minOperations(n);
		System.out.println(ans);

	}

}
