package pq;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedian {
	

	private static void findMedian(int[] arr) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(arr[0]);
		System.out.print(arr[0]+" ");
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<maxHeap.peek()) {
				maxHeap.add(arr[i]);
			}else {
				minHeap.add(arr[i]);
			}
			if(maxHeap.size()-minHeap.size()>1) {
				minHeap.add(maxHeap.remove());
			}else if(minHeap.size()-maxHeap.size()>1) {
				maxHeap.add(minHeap.remove());
			}
			if(Math.abs(maxHeap.size()-minHeap.size())%2==0) {
				System.out.print((maxHeap.peek()+minHeap.peek())/2+" ");
			}else if(maxHeap.size()>minHeap.size()) {
				System.out.print(maxHeap.peek()+" ");
			}else {
				System.out.print(minHeap.peek()+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,2,1,3,7,5};
		findMedian(arr);
		
	}


}
