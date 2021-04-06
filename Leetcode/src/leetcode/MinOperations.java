package leetcode;

import java.util.Scanner;

public class MinOperations {

	public static int minOperations(int n) {
		int count=n/2;
		return count*(count+n%2);		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ans=minOperations(n);
		System.out.println(ans);

	}

}
