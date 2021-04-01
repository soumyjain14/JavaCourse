import java.util.Stack;
public class NearestSmallerToLeft {
	
	public static int[] nstl(int input[]) {
		Stack<Integer> stack=new Stack<>();
		int ans[]=new int[input.length];
		for(int i=0;i<input.length;i++) {
			if(stack.isEmpty()) {
				ans[i]=-1;
			}else {
				if(!stack.isEmpty() && stack.peek()<input[i]) {
					ans[i]=stack.peek();
				}else {
					if(!stack.isEmpty() && stack.peek()>input[i]) {
						while(!stack.isEmpty() && stack.peek()>input[i]) {
							stack.pop();
						}
						if(stack.isEmpty()) {
							ans[i]=-1;
						}else {
							ans[i]=stack.peek();
						}
					}
				}
			}
			stack.push(input[i]);
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {4,5,2,10,8};
		int ans[]=nstl(input);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		

	}

}
