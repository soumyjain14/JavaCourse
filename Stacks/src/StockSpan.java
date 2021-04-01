import java.util.Stack;
public class StockSpan {

	public static int[] stockSpan(int[] price) {
		Stack<Integer> stack=new Stack<>();
		int ans[]=new int[price.length];
		
		for(int i=0;i<price.length;i++) {
			if(stack.isEmpty()) {
				ans[i]=1;
				
				
			}else {
				if(stack.size()>0 && price[stack.peek()]>=price[i]) {
					ans[i]=i-stack.peek();
					
				}else {
					if(stack.size()>0 && price[stack.peek()]<price[i]) {
						while(!stack.isEmpty() && price[stack.peek()]<price[i]) {
							stack.pop();
							
						}
						
						if(stack.isEmpty()) {
							ans[i]=i+1;
							
						}else {
							ans[i]=i-stack.peek();
							
						}
					}
				}
			}
			
			stack.push(i);
			
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[]= {10,10,10,10};
		int ans[]=stockSpan(price);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+ " ");
		}


	}

}
