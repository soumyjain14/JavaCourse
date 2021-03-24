
public class StackUsingArray {
	
	private int data[];
	private int top;
	
	public StackUsingArray() {
		// TODO Auto-generated constructor stub
		data=new int[10];
		top=-1;
	}
	
	public StackUsingArray(int capacity) {
		// TODO Auto-generated constructor stub
		data=new int[capacity];
		top=-1;
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public int size() {
		return top+1;
	}
	
	public int top() throws StackEmptyError {
		if(size()==0) {
			//StackEmpty Error
			StackEmptyError e=new StackEmptyError();
			throw e;
		}
		return data[top];
	}
	
	public void push(int element) throws StackFullException {
		if(size()==data.length) {
			// StackFull Exception
//			StackFullException e=new StackFullException();
//			throw e;
			
			DoubleCapacity();
			
		}
		top++;
		data[top]=element;
	}
	
	private void DoubleCapacity() {
		int temp[]=data;
		data=new int[temp.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	public int pop() throws StackEmptyError {
		if(size()==0) {
			StackEmptyError e=new StackEmptyError();
			throw e;
		}
		int temp=data[top];
		top--;
		return temp;
	}
	
	
}
