package postfix;

class StackNode {
	int data;
	StackNode link;
}

class LinkedStack{
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode; 
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}
