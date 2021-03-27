package queue;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseAQueue {
	
	public static Queue<Integer> reverseQueue(Queue<Integer> input, int length) {
		if(length<1) {
			return input;
		}
		int temp=input.poll();
		
		reverseQueue(input, length-1);
		input.add(temp);
		return input;
		
	}
	
	public static Queue<Integer> reverseQueue(Queue<Integer> input) {
		Queue<Integer> temp=reverseQueue(input, input.size());
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> input =new LinkedList<>();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			input.add(arr[i]);
		}
		
		reverseQueue(input);
		while(!input.isEmpty()) {
			System.out.print(input.poll()+" ");
		}
		
		
		

	}

}
