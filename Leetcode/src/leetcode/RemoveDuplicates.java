package leetcode;

public class RemoveDuplicates {
	
	public static int removeDuplicates(int arr[], int val) {
		int i=0;
		int n=arr.length;
		while(i<n) {
			if(arr[i]!=val) {
				i++;
			}else {
				arr[i]=arr[n-1];
				
				n--;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,3,2,5};
		int i=2;
		int ans=removeDuplicates(arr, i);
		System.out.println(ans);

	}

}
