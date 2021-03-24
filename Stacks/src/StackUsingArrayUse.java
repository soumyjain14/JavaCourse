
public class StackUsingArrayUse {

	public static void main(String[] args) throws StackFullException {
		// TODO Auto-generated method stub
		StackUsingArray s=new StackUsingArray(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		s.push(30);
		s.push(35);
		s.push(40);
		while(!s.isEmpty()) {
			try {
				System.out.println(s.pop());
			} catch (StackEmptyError e) {
			}
		}


	}

}
