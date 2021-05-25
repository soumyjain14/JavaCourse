package pq;

import java.util.ArrayList;

public class Max_Priority_Queue {

	private ArrayList<Integer> heap;

	public Max_Priority_Queue() {
		// TODO Auto-generated constructor stub
		heap=new ArrayList<>();
	}

	boolean isEmpty() {
		return heap.size()==0;
	}

	int getSize() {
		return heap.size();
	}

	int getMax() {
		if(heap.isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;

		while(childIndex>0) {
			if(heap.get(childIndex)>heap.get(parentIndex)) {
				int temp=heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}else {
				return;
			}
		}
	}

	int removeMax() {
		if(heap.isEmpty()) {
			return Integer.MIN_VALUE;
		}else {
			int ans=heap.get(0);
			heap.set(0, heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
			int index=0;
			int maxIndex=index;
			int leftChildIndex=1;
			int rightChildIndex=2;
			while(leftChildIndex<heap.size()) {
				if(heap.get(maxIndex)<heap.get(leftChildIndex)) {
					maxIndex=leftChildIndex;
				}			
				if(rightChildIndex<heap.size() && heap.get(maxIndex)<heap.get(rightChildIndex)) {
					maxIndex=rightChildIndex;
				}
				if(maxIndex==index) {
					break;
				}
				int temp=heap.get(index);
				heap.set(index, heap.get(maxIndex));
				heap.set(maxIndex,temp);
				index=maxIndex;
				leftChildIndex=(2*index)+1;
				rightChildIndex=(2*index)+2;
				
			}
			return ans;
		}

	}

	void print() {
		for(int i: heap) {
			System.out.print(i+" ");
		}
	}


}
