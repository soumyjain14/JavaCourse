package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {
	
	public static ArrayList<Integer> lc(int arr[]){
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], 1);
		}
		int ans=0;int j=0;
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i]-1)) {
				j=arr[i];
				while(map.containsKey(j)) {
					j++;
				}
				if(ans<j-arr[i]) {
					ans=j-arr[i];
					start=arr[i];
					end=(arr[i]+ans-1);
					
				}
				
			}
			
		}
		ArrayList<Integer> output=new ArrayList<>();
		output.add(start);
		output.add(end);
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15, 24, 23 ,12, 19, 11, 16};
		ArrayList<Integer> output=lc(arr);
		for(int i: output) {
			System.out.print(i+" ");
		}
	

	}

}
