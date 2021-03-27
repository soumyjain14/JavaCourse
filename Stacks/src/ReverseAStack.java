import java.util.*;
public class ReverseAStack {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra, int length) {
		if(length<=1) {
			return;
		}
		int temp=input.pop();
		
			reverseStack(input, extra,length-1);
			while(!input.isEmpty()) {
				extra.push(input.pop());
			}
		

		input.push(temp);
		while(!extra.isEmpty()) {
			input.push(extra.pop());
		}
	}

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {

		reverseStack(input, extra,input.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input=new Stack<Integer>();
		Stack<Integer> empty=new Stack<Integer>();
		int arr[]= {1,3,6};
		for(int i=0;i<arr.length;i++) {
			input.push(arr[i]);
		}
		reverseStack(input, empty);
		while(!input.isEmpty()) {
			System.out.print(input.pop()+" ");
		}


	}

}
