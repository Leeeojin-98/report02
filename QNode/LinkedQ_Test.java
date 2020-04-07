package QNode;

public class LinkedQ_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char deletedItem;
		LinkedQueue LQ = new LinkedQueue();
			LQ.enQueue('A');
			LQ.printQueue();
			
			LQ.enQueue('B');
			LQ.printQueue();
			
			deletedItem = LQ.deQueue();
			if(deletedItem != 0)
				System.out.println(" deleted Item : " + deletedItem);
			LQ.printQueue();
			
			LQ.enQueue('C');
			LQ.printQueue();
			
			deletedItem = LQ.deQueue();
			if(deletedItem != 0)
				System.out.println("deleted Item : " + deletedItem);
			LQ.printQueue();
			
			deletedItem = LQ.deQueue();
			if(deletedItem != 0)
				System.out.println("deleted Item : " + deletedItem);
			LQ.printQueue();
			
			deletedItem = LQ.deQueue();
			if(deletedItem != 0)
				System.out.println("deleted Item : " + deletedItem);
			LQ.printQueue();		
	}

}
