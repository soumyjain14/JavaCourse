import java.util.Stack;
public class RoughWork {
	
	public static boolean isPar(String exp) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char x=exp.charAt(i);
			if(x=='('|| x=='{' || x=='[') {
				stack.push(x);
			}
			char a;
			switch(x) {
			case ')':
				if(stack.isEmpty()) {
					return false;
				}
				a=stack.pop();
				if(a=='{' || a=='[') {
					return false;
				}
				break;
			case '}':
				if(stack.isEmpty()) {
					return false;
				}
				a=stack.pop();
				if(a=='(' || a=='[') {
					return false;
				}
				break;
			case ']':
				if(stack.isEmpty()) {
					return false;
				}
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
		String exp="()()))";
		boolean ans=isPar(exp);
		System.out.println(ans);
		

	}

}
