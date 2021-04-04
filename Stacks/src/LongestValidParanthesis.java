import java.util.Stack;
public class LongestValidParanthesis {
	
	public static int lvp(String exp) {
		Stack<Character> stack=new Stack<>();
		int max=-1;int count=0;
		for(int i=0;i<exp.length();i++) {
			char x=exp.charAt(i);			
			if(x=='(' && stack.size()==0) {
				stack.push(x);
			}
			if(stack.isEmpty() && x==')') {
				stack.push(x);
			}
			char a;
			if(stack.size()>0 && x==')') {
				a=stack.peek();
				if(a==')') {
					stack.push(x);
				}else {
					count+=2;
					stack.pop();
					
				}
			}
			if(!stack.isEmpty()) {
				count-=1;
			}
		}
		
		return count;
		
        
    }
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="()((()";
		int ans=lvp(s);
		System.out.println(ans);
		

	}

}
