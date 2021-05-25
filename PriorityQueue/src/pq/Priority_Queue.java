package pq;

import java.util.ArrayList;

public class Priority_Queue {

	private ArrayList<Integer> heap;

	public Priority_Queue(){
		heap=new ArrayList<>();
	}


	boolean isEmpty() {
		return heap.size()==0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws Priority_Queue_Exception {
		if(heap.size()==0) {
			throw new Priority_Queue_Exception();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;

		while(childIndex>0) {
			if(heap.get(parentIndex)>heap.get(childIndex)) {
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

	void print() {
		for(int i: heap) {
			System.out.print(i+" ");
		}
	}

	int removeMin() throws Priority_Queue_Exception {
		if(heap.isEmpty()) {
			throw new Priority_Queue_Exception();
		}else {
			int lastElement=heap.get(heap.size()-1);
			int ans=heap.get(0);
			heap.set(0, lastElement);
			heap.remove(heap.size()-1);
			int index=0;
			int minIndex=index;
			int leftIndex=(2*minIndex)+1;
			int rightIndex=(2*minIndex)+2;

			while(leftIndex<heap.size()) {
				if(heap.get(minIndex)>heap.get(leftIndex)) {
					minIndex=leftIndex;
				}
				if(rightIndex<heap.size() &&  heap.get(minIndex)>heap.get(rightIndex)) {
					minIndex=rightIndex;
				}
				if(minIndex==index) {
					break;
				}
				int temp=heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp);
				index=minIndex;
				leftIndex=(2*index)+1;
				rightIndex=(2*index)+2;
			}

			return ans;
		}
	}

}
