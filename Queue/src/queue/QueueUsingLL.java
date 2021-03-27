package queue;

public class QueueUsingLL {
	
	private Node front;
	private Node rear;
	private int size;
	
	public QueueUsingLL() {
		// TODO Auto-generated constructor stub
		this.front=null;
		this.rear=null;
		this.size=0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public int front() {
		if(size==0) {
			return -1;
		}
		return front.data;
		
	}
	
	public void enqueue(int element) {
		Node newNode=new Node(element);
		if(size==0) {
			front=newNode;
			rear=newNode;
		}
		rear.next=newNode;
		rear=newNode;
		size++;
	}
	
	public int dequeue() {
		if(size==0) {
			return -1;
		}
		int temp1=front.data;
		Node temp=front.next;
		front.next=null;
		front=temp;
		size--;
		return temp1;
	}

}
