package queue;

public class DequeUsingLL {
	int data[];
	int front;
	int rear;
	int size;

	public DequeUsingLL(int capacity) {
		// TODO Auto-generated constructor stub
		data=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	public void enqueue(int element) throws QueueFullException {
		if(size==data.length) {
			doubleCapacity();
			front=0;
			rear=size-1;
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
	}

	private void doubleCapacity() {
		int temp[]=data;
		data=new int[temp.length*2];
		for(int i=front;i<temp.length;i++) {
			data[i-front]=temp[i];
		}
		for(int i=0;i<front;i++) {
			data[i+front+1]=temp[i];
		}
	}
	public boolean isEmpty() {
		return (size==0);
	}

	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
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
		return temp;
	}

	public void insertFront(int element) {
		if(size==data.length) {
			System.out.println("-1");
			return;
		}

		if(size==0) {
			front++;
			data[front]=element;
			rear++;
		}
		else {
			for(int i=size-1;i>=0;i--) {
				data[i+1]=data[i];
			}
			data[0]=element;
			rear++;
		}

		size++;	


	}

	public void insertRear(int element) {
		if(size==data.length) {
			System.out.println("-1");
			return;
		}
			rear++;
			data[rear]=element;
			front=0;
			size++;
		

	}

	public void deleteFront() {
		if(size==0) {
			System.out.println("-1");
			return;
		}
		front++;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
	}
	public void deleteRear() {
		if(size<=0) {
			System.out.println("-1");
			return;
		}
		rear--;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
	}

	public int getFront() {
		if(size==0) {
			return -1;
		}
		int temp=data[front];
		return temp;
	}

	public int getRear() {
		if(size==0) {
			return -1;
		}
		int temp=data[rear];
		return temp;
	}


}
