package pq;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargest {
	
	
	public static ArrayList<Integer> kLargest(int arr[], int k){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		ArrayList<Integer> ans=new ArrayList<>();
		while(!pq.isEmpty()) {
			ans.add(pq.remove());
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2 ,6 ,10, 11, 13, 4 ,1 ,20};
		
		ArrayList<Integer> ans=kLargest(arr, 2);
		for(int i:ans) {
			System.out.print(i+" ");
		}

	}

}
