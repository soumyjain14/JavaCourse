package pq;

public class Priority_QueueUse {

	public static void main(String[] args) throws Priority_Queue_Exception {
		// TODO Auto-generated method stub
		Max_Priority_Queue queue=new Max_Priority_Queue();
		queue.insert(5);
		queue.insert(10);
		queue.insert(7);
		queue.insert(15);
		queue.insert(13);
		System.out.println(queue.removeMax());
		System.out.println(queue.removeMax());
		queue.print();

	}

}
