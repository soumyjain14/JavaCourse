package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		// TODO Auto-generated method stub
		DequeUsingLL queue=new DequeUsingLL(10);
		queue.insertRear(32);
		queue.insertFront(10);
		for(int i=0;i<8;i++) {
			queue.insertRear(i);
		}
		queue.insertRear(10);


		while(!queue.isEmpty()) {

			System.out.print(queue.dequeue()+" ");

		}
	}

}
