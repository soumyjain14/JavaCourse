package recursion;

public class Staircase {
	
	public static int staircase(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return n;
		}
		if(n==2) {
			return n;
		}
		int x=staircase(n-1);
		int y=staircase(n-2);
		int z=staircase(n-3);
		int result=x+y+z;
		return result;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=staircase(n);
		System.out.println(ans);

	}

}
