package maps;

import java.util.HashMap;

//Java program to find index of
//an element in N elements
import java.util.List;


public class TwoSumLC {
	public static int[] twoSum(int arr[], int k) {
		int ans[]=new int[2];
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(k-arr[i])) {
				int v=map.get(k-arr[i]);
				ans[0]=v;ans[1]=i;
				break;
			}else {
				map.put(arr[i], i);
			}
		}
		return ans;
	}


	//	public static int[] twoSum(int arr[], int k) {
	//		HashMap<Integer, Integer> map=new HashMap<>();
	//		for(int i=0;i<arr.length;i++) {
	//			if(map.containsKey(arr[i])) {
	//				int v=map.get(arr[i]);
	//				map.put(arr[i], v+1);
	//			}else {
	//				map.put(arr[i], 1);
	//			}
	//		}
	//		int ans[]=new int [2];
	//		for(int i=0;i<arr.length;i++) {
	//			if(k-arr[i]==arr[i]) {
	//				ans[0]=i;ans[1]=search(arr,k-arr[i]);
	//			}else {
	//				if(map.containsKey(k-arr[i]) && (k-arr[i]!=arr[i])) {				
	//					//System.out.println(arr[i]+" "+(k-arr[i]));
	//					ans[0]=i;ans[1]=search(arr, k-arr[i]);
	//					break;				
	//				}
	//			}
	//		}
	//		return ans;
	//	}
	//	
	//	private static int search(int arr[], int k) {
	//		for(int i=0;i<arr.length;i++) {
	//			if(arr[i]==k) {
	//				return i;
	//			}
	//		}
	//		return -1;
	//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,11,7,15};
		int target=9;
		int ans[]=twoSum(arr, target);
		for(int i:ans) {
			System.out.print(i+" ");
		}


	}

}
