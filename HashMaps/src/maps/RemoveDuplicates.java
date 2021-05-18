 package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int arr[]){
		ArrayList<Integer> output=new ArrayList<>();
		HashMap<Integer, Boolean> seen=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(seen.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			seen.put(arr[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,2,3,5,6,1,3};
		ArrayList<Integer> output=removeDuplicates(arr);
		for(int i=0;i<output.size();i++) {
			System.out.print(output.get(i)+" ");
		}

	}

}
