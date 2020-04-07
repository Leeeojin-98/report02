package Stack;

	interface Stack{
		boolean	isEmpty();
		void push(char item);
		char pop();
		void delete();
		char peek();
	}

	class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1); // stack값이 비어있는지 검사
	}

	public boolean isFull() {
		return (top == this.stackSize-1); //stack이 꽉 찼는지 검사
	}
	@Override
	public void push(char item) { //먼저 stack 찼는지 확인
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!"); //꽉차면 꽉찼다고 출력
		}
		else {
			itemArray[++top] = item; //top값을 1증가 시킨다음 itemArray에 item을 할당하고
			System.out.println("Inserted Item: " + item);  //삽입된 데이터값을 출력
		}
	}

	@Override
	public char pop() { //stack이 비어있는지 확인
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty"); //비어있으면 비어있다고 출력
			return 0;
		}
		else {
			return itemArray[top--];//top이 가리키고있는 곳에 값을 return 한후에 top값을 1감소
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty"); //비어있는지 확인
		}
		else {
			top--; //top 값만 1감소
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("peeking fail! Array Stack is empty!!"); //stack이 비어있는지 검사후 비어있으면 데이터를 가져올수없다고 출력
			return 0;
		}
		else {
			return itemArray[top]; //top가지고있는 값을 return
		}//top포인트가 무엇인지 알고자할때 이 메소드 사용하며됨
	}
	public void printlnStack() {
		if(isEmpty()) {
			System.out.println("Array Stack is empty!! %n %n");
		}
		else {
			System.out.println("Array Stack>>"); //stack 값을 순서대로 출력함
			for(int i = 0; i<=top; i++)
				System.out.printf("%c", itemArray[i]);
			System.out.println(); System.out.println();
		}
	}
}
