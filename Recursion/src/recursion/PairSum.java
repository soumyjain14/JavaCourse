package recursion;

public class PairSum {


	public static int pairSum(int[] arr, int num) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length-1;j++) {
				if(arr[i]+arr[j+1]==num) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {2,2,2,2,2};
		int num=4;
		int ans=pairSum(input, num);
		System.out.println(ans);

	}

}
