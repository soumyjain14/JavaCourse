package maps;

import java.util.HashMap;

public class MaxFrequency {

	public static int maxFreq(int arr[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int v=map.get(arr[i]);
				map.put(arr[i], v+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		int max=Integer.MIN_VALUE;
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(max<map.get(arr[i])) {
				max=map.get(arr[i]);
				ans=arr[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,2,2};
		System.out.println(maxFreq(arr));
	}

}
