package maps;

import java.util.HashMap;

public class PairWithDifferenceK {

	public static int pairWithDifferenceK(int arr[], int k) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int v=map.get(arr[i]);
				map.put(arr[i], v+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(k==0) {
				if(map.containsKey(arr[i])) {
					int ans=countZero(map.get(arr[i]))-map.get(arr[i]);
					count=ans;
					
				}
				
			}else {
				if(map.containsKey(arr[i]-k)) {
					count+=(map.get(arr[i])*map.get(arr[i]-k));
				}

				if(map.containsKey(k+arr[i])) {
					count+=(map.get(arr[i])*map.get(arr[i]+k));
				}

				map.put(arr[i], 0);
			}
		}
		return count;
	}

	private static int countZero(int n) {
		if(n==1) {
			return 1;
		}
		return countZero(n-1)+n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,4,4,4};
		int k=0;
		System.out.println(pairWithDifferenceK(arr, k));
		System.out.println(countZero(4));

	}

}
