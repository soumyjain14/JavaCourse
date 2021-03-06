package recursion;

public class BinarySearchRecursive {

	public static int binarySearch(int input[], int element, int start, int end) {
		int mid=(start+end)/2;
		if(mid<=end && start<=mid) {
		
		if(input[mid]==element) {
			return mid;
		}
		if(input[mid]<element) {
			int position=binarySearch(input, element, mid+1, end);
			return position;
		}else if(input[mid]>element) {
			int position=binarySearch(input, element, start, mid-1);
			return position;

		}
		
	}
		return -1;
	}


	public static int binarySearch(int input[], int element) {
		int position=binarySearch(input, element, 0, input.length-1);
		return position;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {3,4,5,6,7,8,9};
		int position=binarySearch(input,6);
		System.out.println(position);

	}

}
