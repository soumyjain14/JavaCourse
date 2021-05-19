package maps;

import java.util.HashMap;

public class PairSum {
	
	public static int pairSum(int arr[], int size) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<size;i++) {
			if(map.containsKey(arr[i])) {
				int v=map.get(arr[i]);
				map.put(arr[i], v+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		int zero=0;
		if(map.containsKey(0)) {
		zero=countZero(map.get(0))-map.get(0);	
		}
		int count=0;
		for(int i=0;i<size;i++) {
			if(map.containsKey(-arr[i]) && arr[i]!=0) {
				count=count+(map.get(arr[i])*map.get(-arr[i]));
				map.put(arr[i], 0);
				map.put(-arr[i], 0);
			}
		}
		return count+zero;
	}
	
	public static int countZero(int n) {
		if(n==1) {
			return 1;
		}
		return countZero(n-1)+n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,0,0};
		int size=arr.length;
		System.out.println(pairSum(arr, size));
		System.out.println(countZero(5));

	}

}
