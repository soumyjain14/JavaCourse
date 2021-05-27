package pq;

public class CheckMaxHeap {
	
	private static boolean checkMaxheap(int[] arr, int i) {
		// TODO Auto-generated method stub
		int parentIndex=i;
		int leftChildIndex=(2*parentIndex)+1;
		int rightChildIndex=(2*parentIndex)+2;
		
		while(leftChildIndex<arr.length) {
			if(arr[parentIndex]<arr[leftChildIndex]) {
				return false;
			}
			if(rightChildIndex<arr.length && arr[parentIndex]<arr[rightChildIndex]) {
				return false;
			}
			parentIndex++;
			leftChildIndex=(2*parentIndex)+1;
			rightChildIndex=(2*parentIndex)+2;
			
		}
		return true;
	}
	
	public static boolean checkMaxheap(int arr[]) {
		return checkMaxheap(arr,0);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12, 20, 18, 6 ,14, 11, 9 ,4};
		System.out.println(checkMaxheap(arr));
		

	}

}
