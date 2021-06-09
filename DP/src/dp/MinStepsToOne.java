package dp;

public class MinStepsToOne {

	public static int minStepsToOne(int n) {
		if(n==1) {
			return 0;
		}
		int option1=Integer.MAX_VALUE;
		int option2=Integer.MAX_VALUE;
		int option3=Integer.MAX_VALUE;
		
		if(n%3==0) {
			option1=1+minStepsToOne(n/3);
		}
		if(n%2==0) {
			option2=1+minStepsToOne(n/2);
		}
		option3=1+minStepsToOne(n-1);
		return Math.min(option1, Math.min(option2, option3));

	}
	
	private static int minStepsM(int n) {
		int storage[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			storage[i]=-1;
		}
		return minStepsM(storage,n);
		
	}

	
	private static int minStepsM(int[] storage, int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			storage[n]=0;
			return storage[n];
		}
		if(storage[n]!=-1) {
			return storage[n];
		}
		
		int option1=Integer.MAX_VALUE;
		int option2=Integer.MAX_VALUE;
		int option3=Integer.MAX_VALUE;
		
		if(n%3==0) {
			option1=1+minStepsM(storage,n/3);
		}
		if(n%2==0) {
			option2=1+minStepsM(storage,n/2);
		}
		option3=1+minStepsM(storage,n-1);
		return Math.min(option1, Math.min(option2, option3));

	}
	
	private static int minDP(int n) {
		int storage[]=new int[n+1];
		storage[1]=0;
		for(int i=2;i<=n;i++) {
			int min=storage[i-1];
			if(i%2==0) {
				min=Math.min(min, storage[i/2]);
			}
			if(i%3==0) {
				min=Math.min(min, storage[i/3]);
			}
			
			storage[i]=min+1;
				
		}
		return storage[n];
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1024;
		System.out.println(minDP(n));
		System.out.println(minStepsM(n));
		System.out.println(minStepsToOne(n));

	}

}
