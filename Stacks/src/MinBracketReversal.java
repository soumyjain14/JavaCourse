import java.util.Stack;
import java.lang.*;
public class MinBracketReversal {

	public static int countBracketReversals(String input) {
		Stack<Character> stack=new Stack<>();
		if(input.length()%2!=0) {
			return -1;
		}
		int count=0;

		for(int i=0;i<input.length();i++) {
			char x=input.charAt(i);
			if(x=='{') {
				stack.push(x);
			}else {
				if(stack.isEmpty()) {
					stack.push(x);
				}else {
					if(stack.peek()=='}') {
						stack.push(x);
					}else {
						stack.pop();
					}
				}
			}
		}
		
		while(!stack.isEmpty()) {
			char c1=stack.pop();
			char c2=stack.pop();
			if (c1==c2) {
				count++;
			}
			if(c1=='{' && c2=='}') {
				count+=2;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="{{{}}{";
		int ans=countBracketReversals(input);
		System.out.println(ans);


	}

}
