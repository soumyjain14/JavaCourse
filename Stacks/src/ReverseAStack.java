import java.util.*;
public class ReverseAStack {
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		while(!input.isEmpty()) {
			extra.push(input.pop());
		}
		int i=0;
		while(!extra.isEmpty() && i<extra.size()) {
			input.push(extra.elementAt(i));
			i++;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input=new Stack<Integer>();
		Stack<Integer> empty=new Stack<Integer>();
		int arr[]= {1,2,3,4,5,10};
		for(int i=0;i<arr.length;i++) {
			input.push(arr[i]);
		}
		reverseStack(input, empty);
		while(!input.isEmpty()) {
			System.out.print(input.pop()+" ");
		}
		

	}

}
