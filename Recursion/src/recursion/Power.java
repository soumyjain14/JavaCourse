package recursion;

import java.util.Scanner;

public class Power {
	static int hero;
	

	public static int fib(int n) {
		if(n==0){
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		int smallAns = fib(n-1)+fib(n-2);
		return smallAns;
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=fib(n);
		System.out.println(ans);
		
	}
}
