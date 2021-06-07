package dp;

public class FibonacciMemoization {
	
	public static int fib(int n) {
		if(n==1 || n==0) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	
	public static int fibM(int n) {
		int storage[]=new int[n+1];
		for(int i=0;i<storage.length;i++) {
			storage[i]=-1;
		}
		return fibM(n,storage);
	}

	private static int fibM(int n, int[] storage) {
		// TODO Auto-generated method stub
		if(n==1 || n==0) {
			storage[n]=n;
			return storage[n];
		}
		if(storage[n]!=-1) {
			return storage[n];
		}
		storage[n]=fibM(n-1,storage)+fibM(n-2, storage);
		return storage[n];
		
	}
	
	private static int fibDP(int n) {
		int storage[]=new int[n+1];
		storage[0]=0;
		storage[1]=1;
		for(int i=2;i<=n;i++) {
			storage[i]=storage[i-1]+storage[i-2];
		}
		return storage[n];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=46;
		System.out.println(fibDP(n));
		System.out.println(fibM(n));
		System.out.println(fib(n));

	}

}
