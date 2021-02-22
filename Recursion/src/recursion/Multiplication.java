package recursion;

public class Multiplication {
	
	public static int multiplyTwoIntegers(int m, int n) {
		if(m==0 || n==0) {
			return 0;
		}
		if(n==1) {
			return m;
		}
		int ans=multiplyTwoIntegers(m, n-1)+m;
		return ans;
	}

	
	
	public static void main(String args[]) {
		int ans=multiplyTwoIntegers(4,0);
		System.out.println(ans);
		
	}
}
