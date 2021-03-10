package recursion;

public class TripletSum {

	public static int tripletSum(int[] arr, int num) {
		int count=0;

		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length-1;j++) {
				for(int k=j;k<arr.length-2;k++)
				if(arr[i]+arr[j+1]+arr[k+2]==num) {
					count++;
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {2,-5,8,-6,0,5,10,11,-3};
		int num=10;
		int ans=tripletSum(input, num);
		System.out.println(ans);



	}

}
