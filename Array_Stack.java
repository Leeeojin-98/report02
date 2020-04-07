package Stack;

class Array_Stack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stackSize = 5;
		char deleteItem;
		ArrayStack S = new ArrayStack(stackSize);
		
		S.push('a');
		S.printlnStack();
		
		S.push('b');
		S.printlnStack();
		
		S.push('c');
		S.printlnStack();
		
		deleteItem = S.pop();
		if(deleteItem != 0)
			System.out.println("deleted Item: " + deleteItem);
		S.printlnStack();
		
	}

}
