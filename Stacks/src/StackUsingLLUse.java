
public class StackUsingLLUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLL<Integer> stack=new StackUsingLL<>();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(20);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
