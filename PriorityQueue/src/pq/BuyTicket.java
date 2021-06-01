package pq;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BuyTicket {
	
	
	private static int buyTickets(int arr[], int k) {
		Queue<Integer> queue=new LinkedList<>();
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			queue.add(i);
			pq.add(arr[i]);
		}
		int count=0;
		while(!pq.isEmpty()) {
			if(arr[queue.peek()]==pq.peek()) {
				count++;
				pq.remove();
				if(k==queue.remove()) {
					return count;
				}
			}else {
				queue.add(queue.poll());
			}
		}
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,2,2,4};
		int k=3;
		int ans=buyTickets(arr,k);
		System.out.println(ans);
	}



}


