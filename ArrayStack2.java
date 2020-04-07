package ArrayStack2;
import java.util.EmptyStackException;

public class ArrayStack2<E> {
	private E s[]; //스택을 위한 배열
	private int top; // 스택의 top항목의 배열원소 인덱스
	public ArrayStack2() {//스택 생성자
		s = (E[]) new Object[1]; //초기에 크기가 1인 배열생성
		top = -1;
	}
	public int size() { return top+1;} //스택에 있는 항목의 수를 리턴
	public boolean isEmpty() {return (top == -1);} // 스택이 empty이면 true리턴
	//peek(), push(), pop(), resize() 메소드선언
	
	public E peek() {//스택 top 항목의 내용만을 리턴
		if(isEmpty()) throw new  EmptyStackException(); // underflow 시 프로그램 정지
		return s[top];
	}
	
	public void push(E newItem) { //push연산
		if (size() == s.length) //스택이 다 찼으면
			resize(2*s.length); //스택을 2배의 크기로 확장
		s[++top] = newItem; //top을 1층가후에 새 항목을 push 
	}
	public E pop() { //pop 연산
		if(isEmpty()) throw new EmptyStackException(); //underflow 시 프로그램 정지
		E item = s[top]; //top이 가리키는 항목을 item에 시킨후에 
		s[top--] = null; //top이 가리키는 곳에 null로 초기화후에 1감소
		if(size() > 0 && size() == s.length/4) //항목의 수가 배열의 크기보다  1/4이하이면 
			resize(s.length/2); //스택을 1/2 크기로 축소 
		return item;
	}
    private void resize(int newSize) { 
        Object[] t = new Object[newSize]; 
        for(int i = 0; i < size(); i++) 
           t[i] = s[i];
           s = (E[]) t;
     }
	public void print() { 
		if(isEmpty())
			System.out.print("배열이 비어있음.");
		else
			for(int i = 0; i< s.length; i++) System.out.print(s[i]+"\t");
		System.out.println();
	}
}
