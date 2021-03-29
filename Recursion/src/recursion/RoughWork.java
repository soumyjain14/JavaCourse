package recursion;


import java.util.Scanner;
import java.lang.Math;

public class RoughWork {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t>0) {
		int v=scan.nextInt();
		int u=scan.nextInt();
		int a=scan.nextInt();
		int s=scan.nextInt();
		if(v==u || Math.sqrt(((u*u)-(2*a*s)))<=v) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}		
		t--;
		}
		
	}

}
