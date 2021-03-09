package recursion;

public class UniqueElements {

	public static int findUnique(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=ans^arr[i];

		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {2,3,1,1,3,6,2};
		int ans=findUnique(input);
		System.out.println(ans);

	}

}
