
package Bracket_test;

	interface Stack{
		boolean isEmpty();
		void push(char item);
		char pop();
		void delete();
		char peek();
	}
class StackNode {
	char data;
	StackNode link;
}

class LinkedStack implements Stack{
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null); //스택이 비어있는지 검사
	}
	
	public void push(char item) { 
		StackNode newNode = new StackNode(); //newNode객체 생성
		newNode.data = item; //인자로 받은 item을 newNode데이터에 할당하고
		newNode.link = top; //top을 newNode.link에 할당
		top = newNode; //newNode를 top으로 할당
		System.out.println("Inserted Item: " + item); //출력
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!"); //비어있으면 비어있어서 삭제할수없다 출력
			return 0; //0리턴
		}
		else {
			char item = top.data; //top이 가리키고있는 데이터를 변수 item에 할당하고
			top = top.link; // top.link값을 top에 할당하고
			return item; //item을 리턴
		}
		
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}
		else {
			top = top.link; // top.link값을 top에 할당한다 즉 삭제만 하고있다.
		}
	}
	public char peek() {
		if(isEmpty()) { //비어있는지 검사
			System.out.println("peeking fail! LinkedStack is empty!!");
			return 0; 
		}
		else {
			return top.data; //비어있지 않으면 top.data값을 리턴  
		//즉 top데이터에 어떤데이터가 있는지 확인하는것
		}
	}
	public void printlnStack() {
		if(isEmpty())
			System.out.printf("Linked Stack is empty!! %n %n");
		else {
			StackNode temp = top;
			System.out.println("Linked Stack>>");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
}
