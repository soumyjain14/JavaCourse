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
		int input[]= {0,0,0,2,2,2,2};
		int position=binarySearch(input,2);
		System.out.println(position);

	}

}
