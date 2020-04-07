package DQ;
public class DQ_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char deletedItem;
		DQueue DQ = new DQueue();
		
		DQ.insertFront('A');
		DQ.printDQueue();
		
		DQ.insertFront('B');
		DQ.printDQueue();
		
		DQ.insertFront('C');
		DQ.printDQueue();
		
		deletedItem = DQ.deleteFront();
		if(deletedItem != 0)
			System.out.println("front delted Item : " + deletedItem);
		DQ.printDQueue();
		
		deletedItem = DQ.deleteRear();
		if(deletedItem != 0)
			System.out.println("Rear delted Item : " + deletedItem);
		DQ.printDQueue();
		
		DQ.insertRear('D');
		DQ.printDQueue();
		
		DQ.insertFront('E');
		DQ.printDQueue();
		
		DQ.insertFront('F');
		DQ.printDQueue();
		
	}
}
