package pq;

import java.util.PriorityQueue;

public class SortKSorted {
	
	private static void sortKSorted(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int j=0;j<k;j++) {
			arr[j]=pq.remove();
			pq.add(arr[j+k]);
		}
		for(int j=k;j<arr.length;j++) {
			arr[j]=pq.remove();
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,1,9,6,8};
		int k=3;
		sortKSorted(arr,k);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

	
}
