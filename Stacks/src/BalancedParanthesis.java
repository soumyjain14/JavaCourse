import java.util.Stack;

public class BalancedParanthesis {

	public static boolean isBalanced(String exp) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char x=exp.charAt(i);
			if(x=='(' || x=='{' || x=='[') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			
			char a;
			switch(x) {
			case ')':
				a=stack.pop();
				if(a=='{' || a=='[') {
					return false;
				}
				break;
			case '}':
				a=stack.pop();
				if(a=='(' || a=='[') {
					return false;
				}
				break;
			case ']':
				a=stack.pop();
				if(a=='{' || a=='(') {
					return false;
				}
				break;
			}
			
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="(a+b)";
		boolean ans=isBalanced(exp);
		System.out.println(ans);


	}

}
