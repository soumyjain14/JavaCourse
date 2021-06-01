package pq;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSorted {
	
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> arr){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.get(i).size();j++) {
				pq.add(arr.get(i).get(j));
			}
		}
		ArrayList<Integer> output=new ArrayList<>();
		while(!pq.isEmpty()) {
			output.add(pq.remove());
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> first=new ArrayList<>();
		first.add(4);
		first.add(2);
		first.add(3);
		ArrayList<Integer> second=new ArrayList<>();
		second.add(45);
		second.add(1);
		ArrayList<ArrayList<Integer>> output=new ArrayList<>();
		output.add(first);
		output.add(second);
		ArrayList<Integer> ans=new ArrayList<>();
		ans=mergeKSortedArrays(output);
		for(int i:ans) {
			System.out.print(i+" ");
		}
		
	

	}

}
