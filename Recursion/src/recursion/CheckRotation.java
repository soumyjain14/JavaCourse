package recursion;

public class CheckRotation {

	public static int arrayRotateCheck(int[] arr) {
		int k=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]<arr[i]) {
				k=i;
			}
		}
		if(k==0) {
			return 0;
		}else {
			return k+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {5,6,1,2,3,4};
		int ans=arrayRotateCheck(input);
		System.out.println(ans);

	}

}
