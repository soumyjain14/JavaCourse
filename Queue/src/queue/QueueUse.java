package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		// TODO Auto-generated method stub
		QueueUsingArray queue=new QueueUsingArray();
		queue.enqueue(10);
		//queue.dequeue();		
		queue.enqueue(15);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue();
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				
			}
		}

	}

}
