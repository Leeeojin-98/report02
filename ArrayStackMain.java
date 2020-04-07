package ArrayStack2;
public class ArrayStackMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack2<String> stack = new ArrayStack2<String>();
		
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
	}

}
