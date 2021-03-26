package queue;

public class QueueUsingArray {
	
	int data[];
	int front;
	int rear;
	int size;
	
	public QueueUsingArray() {
		// TODO Auto-generated constructor stub
		data=new int[5];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public QueueUsingArray(int capacity) {
		// TODO Auto-generated constructor stub
		data=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public void enqueue(int element) throws QueueFullException {
		if(size==data.length) {
			throw new QueueFullException();
		}
		
		if(size==0) {
			front=0;
		}
		if(rear==data.length) {
			rear=-1;
			front=0;
		}
		rear++;
		data[rear]=element;
		size++;
	}
	
	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp=data[front];
		front++;
		size--;
		if(size==0) {
			rear=-1;
			front=-1;
		}
		return temp;
	}

}
