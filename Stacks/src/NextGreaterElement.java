import java.util.Stack;
public class NextGreaterElement {

	public static int[] nextGreater(int input[]) {
		Stack<Integer>stack=new Stack<>();
		int ans[]=new int[input.length];
		for(int i=input.length-1;i>=0;i--) {
			if(stack.isEmpty()) {
				ans[i]=-1;
			}else {
				if(stack.size()>0 && stack.peek()>input[i]) {
					ans[i]=stack.peek();
				}else {
					if(stack.size()>0 && stack.peek()<input[i]) {
						while(!stack.isEmpty() && stack.peek()<input[i]) {
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
		int input[]= {2,5,9,3,1,12,6,8,7};
		int ans[]=nextGreater(input);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
