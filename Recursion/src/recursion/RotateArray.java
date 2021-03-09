package recursion;

public class RotateArray {

	public static void rotate(int[] arr, int d) {
		if(d==0) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
		}
		else {
			int input[]=new int[arr.length];
			
			int c=0;
			for(int i=0;i<arr.length-d;i++) {
				input[i]=arr[i+d];
				c++;
			}
			for(int i=0;i<arr.length-c;i++) {
				input[i+c]=arr[i];
			}
			for(int i=0;i<input.length;i++) {
				arr[i]=input[i];
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {2,6,3,1,5,9,8};
		int d=2;
		rotate(input, d);

	}

}
