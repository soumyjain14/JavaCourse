package recursion;

import java.util.Scanner;

public class Factorial {
	
	public int fact(int number) {
		if(number ==0 || number==1) {
			return 1;
		}
		return fact(number-1)*number;
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		
		int result=f.fact(n);
		System.out.println(result);

	}

}
