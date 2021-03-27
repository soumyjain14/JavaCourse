package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		// TODO Auto-generated method stub
		QueueUsingLL queue=new QueueUsingLL();
		queue.enqueue(5);		
		queue.enqueue(10);		
		queue.enqueue(15);
		queue.enqueue(20);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(25);
		queue.enqueue(30);
		queue.enqueue(35);
		queue.enqueue(45);
		queue.enqueue(55);
		queue.enqueue(65);
		queue.dequeue();
		queue.dequeue();

		while(!queue.isEmpty()) {

			System.out.println(queue.dequeue());

		}
	}

}
