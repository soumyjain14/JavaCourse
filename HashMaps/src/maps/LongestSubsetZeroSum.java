package maps;

import java.util.HashMap;

public class LongestSubsetZeroSum {
	
	public static int lengthOf(int arr[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(arr[0], 1);
		int maxValue=0;int tempSum=arr[0];
		for(int i=1;i<arr.length;i++) {
			tempSum+=arr[i];
			if(tempSum==0) {
				if(maxValue<i) {
					maxValue=i+1;
				}
			}
			if(map.containsKey(tempSum)) {
				int v=map.get(tempSum);
				if(maxValue<=(i-v)) {
					maxValue=i-v;
				}
			}else {
				map.put(tempSum, i);
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,-2,0,-2,2};
		System.out.println(lengthOf(arr));

	}

}
