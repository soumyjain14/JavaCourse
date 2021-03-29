import java.util.Stack;

public class CheckRedundantBrackets {

	public static boolean checkRedundantBrackets(String exp) {
		Stack<Character> stack=new Stack<>();
		int count=0;
	
		for(int i=0;i<exp.length();i++) {
			count=0;
			char x=exp.charAt(i);
			if(x!=')') {
				stack.push(x);
			}
			
			switch(x) {
			case(')'):
				while(stack.peek()!='(') {							
				count++;
				stack.pop();
				}
			if(count<=1) {
				return true;
			}
			
			stack.pop();
			
			break;			
		
			}
			
		}
		return false;
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="((a+b))";
		boolean ans=checkRedundantBrackets(exp);
		System.out.println(ans);

	}

}
