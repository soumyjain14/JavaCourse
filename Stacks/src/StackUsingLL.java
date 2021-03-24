
public class StackUsingLL<T> {

	private Node<Integer> head;
	private int size;


	public StackUsingLL() {
		// TODO Auto-generated constructor stub
		this.head=null;
		this.size=0;
	}
	public StackUsingLL(int data) {
		// TODO Auto-generated constructor stub
		Node<Integer> newNode =new Node<>(data);		
		this.head=newNode;
		this.size=1;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		if(size<=0) {
			return true;
		}else {
			return false;
		}
	}

	public void push(int element) {
		Node<Integer> newNode=new Node<>(element);
		if(head==null) {
			head=newNode;
			size=1;

		}else {
			newNode.next=head;
			head=newNode;
			size++;
		}
	}

	public int pop() {
		if(size==0) {
			return -1;
		}else {
			int temp=head.data;
			head=head.next;
			size--;
			return temp;
		}
	}



}
