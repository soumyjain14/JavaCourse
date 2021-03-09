package recursion;

public class DuplicateInArray {
	
	public static int findDuplicate(int[] arr) {
		int sum=0;int est=0;
		int length=arr.length-2;
		sum=(length*(length+1))/2;
		
		for(int i=0;i<arr.length;i++) {
			est=est+arr[i];
		}
		
		return est-sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {0,3,1,5,4,3,2};
		int ans=findDuplicate(input);
		System.out.println(ans);

	}

}
