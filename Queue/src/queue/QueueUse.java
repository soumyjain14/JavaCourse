package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		// TODO Auto-generated method stub
		QueueUsingArray queue=new QueueUsingArray(3);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		System.out.println(queue.Rear());
		System.out.println(queue.isFull());
		queue.dequeue();
		queue.enqueue(4);
		System.out.println(queue.Rear());
//		while(!queue.isEmpty()) {
//
//			System.out.print(queue.dequeue()+" ");
//
//		}
	}

}
