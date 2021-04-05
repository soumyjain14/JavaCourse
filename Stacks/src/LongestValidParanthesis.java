import java.util.Stack;
public class LongestValidParanthesis {
	
	public static int lvp(String exp) {
		Stack<Integer> stack=new Stack<>();
		stack.push(-1);
		int result=0;
		for(int i=0;i<exp.length();i++) {
			char x=exp.charAt(i);
			
			if(x=='(') {
				stack.push(i);
			}else {
				if(!stack.isEmpty()) {
					stack.pop();
				}
				
				if(!stack.isEmpty()) {
					result=Math.max(result, i-stack.peek());
				}else {
					stack.push(i);
				}
			}
		}
		return result;
    }
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(())";
		int ans=lvp(s);
		System.out.println(ans);
		

	}

}
