package ListQueue;
public class NodeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue<String> q = new ListQueue<String>();
		
		q.add("apple"); q.add("orange");
		q.add("cherry"); q.add("pear");
		q.print();
		
		q.remove(); q.print();
		q.remove(); q.print();
		
		q.add("grape"); q.print();
	}

}
