
public class StackUsingArray {
	
	private int data[];
	private int top;
	
	public StackUsingArray() {
		data=new int[10];
		top=-1;
	}
	
	public StackUsingArray(int capacity) {
		data=new int[capacity];
		top=-1;
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		if(top==-1) {
			return 0;
		}else {
			return top+1;
		}
	}
	
	public int top() throws StackEmptyError {
		if(top==-1) {
			//StackEmpty Error
			StackEmptyError e=new StackEmptyError();
			throw e;
		}
		return data[top];
	}
	
	public void push(int element) throws StackFullException {
		if(size()==data.length) {
			//StackOverFlow Error
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
		if(size()<=0) {
			//
			StackEmptyError e=new StackEmptyError();
			throw e;
		}
		int temp=data[top];
		top--;
		return temp;
	}
	
	
}
