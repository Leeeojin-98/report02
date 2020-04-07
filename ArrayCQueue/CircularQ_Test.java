package ArrayCQueue;
public class CircularQ_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int queueSize = 4;
		char deletedItem;
		ArrayCQueue cQ = new ArrayCQueue(queueSize);
		
		cQ.enQueue('A');
		cQ.printQueue();
		
		cQ.enQueue('B');
		cQ.printQueue();
		
		deletedItem = cQ.deQueue();
		if(deletedItem != 0)
			System.out.println("delted Item: " + deletedItem);
		cQ.printQueue();
		
		cQ.enQueue('C');
		cQ.printQueue();

		cQ.enQueue('D');
		cQ.printQueue();

		cQ.enQueue('E');
		cQ.printQueue();
	}

}
