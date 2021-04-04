package queue;
//Edit starts
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
	
	public boolean isFull() {
		return (size==data.length);
	}
	
	public int front() throws QueueEmptyException {
		if(size==0) {
			return -1;
		}
		return data[front];
	}
	
	public void enqueue(int element) throws QueueFullException {
		if(size==data.length) {
			System.out.println("false");
			return;
		}
		
		if(size==0) {
			front=0;
		}
		if(rear==data.length-1) {
			rear=-1;
			//front=0;
		}
		rear++;
		data[rear]=element;
		size++;
		System.out.println("True");
	}
	public int Rear() {
        if(size==0){
            return -1;
        }
        return data[rear];
        
    }
	
//	private void doubleCapacity() {
//		int temp[]=data;
//		data=new int[temp.length*2];
//		for(int i=front;i<temp.length;i++) {
//			data[i-front]=temp[i];
//		}
//		for(int i=0;i<front;i++) {
//			data[i+front+1]=temp[i];
//		}
//	}
	
	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			System.out.println("False");
			return -1;
			
		}
		int temp=data[front];
		if(front==data.length-1) {
			front=-1;
		}
		front++;
		size--;
		if(size==0) {
			rear=-1;
			front=-1;
		}
		System.out.println("True");
		return temp;
	}

}
