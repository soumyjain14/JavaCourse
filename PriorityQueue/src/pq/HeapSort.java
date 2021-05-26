package pq;

public class HeapSort {

	private static void insertIntoVirtualArray(int[] arr, int i) {
		// TODO Auto-generated method stub
		int childIndex=i;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0) {
			if(arr[childIndex]<arr[parentIndex]) {
				int temp=arr[parentIndex];
				arr[parentIndex]=arr[childIndex];
				arr[childIndex]=temp;
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}else {
				return;
			}
		}

	}

	private static int removedElement(int[] arr, int i) {
		// TODO Auto-generated method stub
		int ans=arr[0];
		int index=0;
		arr[0]=arr[arr.length-1-i];
		
		int leftChildIndex=1;
		int rightChildIndex=2;

		while(leftChildIndex<arr.length-1-i) {
			int minIndex=index;
			if(arr[minIndex]>arr[leftChildIndex]) {
				minIndex=leftChildIndex;
			}
			if(rightChildIndex<arr.length-1-i &&  arr[minIndex]>arr[rightChildIndex]) {
				minIndex=rightChildIndex;
			}
			if(minIndex==index) {
				break;
			}
			int temp=arr[index];
			arr[index]=arr[minIndex];
			arr[minIndex]=temp;
			index=minIndex;
			leftChildIndex=(2*index)+1;
			rightChildIndex=(2*index)+2;
		}
		return ans;
	}


	public static void inPlaceHeapSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			insertIntoVirtualArray(arr,i);
		}
		
		
		for(int i=0;i<arr.length;i++) {
			arr[arr.length-1-i]= removedElement(arr,i);
		}

		for(int i:arr) {
			System.out.print(i+" ");
		}

		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,7,4,5,6,3,2,1};
		inPlaceHeapSort(arr);
	}

}
