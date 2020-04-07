package Queue3;
import java.util.NoSuchElementException;
public class ArrayQueue <E>{
	private E[] q; //q를 위한 배열
	private int front, rear, size;
	public ArrayQueue() { //생성자
		 q = (E[]) new Object[2]; //초기에 크기가 2인 배열 생성
		 front = rear = size = 0;
	}
	public int size() {return size;} //q에  있는 항목의 수를 리턴
	public boolean isEmpty() { return (size == 0);}// q에 empty이면 true를 리턴
	public void add(E newItem) { //큐 삽입 연산
		if ((rear+1%q.length ==front)) //비어있는 원소가 1개뿐인 경우(즉, q가 full인 경우)
		resize(2*q.length); //q의 크기를 2배로 확장
		rear = (rear+1) % q.length;
		q[rear] = newItem; //새 항목을 add
		size++;
	}
	public E remove() { //q 삭제 연산
		if(isEmpty()) throw new NoSuchElementException(); 
		front = (front+1) % q.length;
		E item = q[front];
		q[front] = null; //null로 만들어 가비지 컬렉션되도록
		size--;
		if(size > 0 && size == q.length/4)//q의 항목수가 배열 크기의 1/4가 되면
			resize(q.length/2); //q를 1/2크기로 축소
		return item;
	}	
	private void resize(int newSize) { //q를 배열 크기조절
		Object[] t = new Object[newSize]; //newSize 크기의 새로운 배열 t 생성
		for(int i = 1, j = front+1; i < size +1; i++, j++) {
			t[i] = q[j%q.length]; //배열q의 항목들을 배열 t[1]로부터 복사
		}
		front = 0;
		rear = size;
		q = (E[]) t; //배열 t를 배열 q로
	}
	public void print() { //q의 항목들을 출력
		if(isEmpty())
			System.out.print("q가 비어잇음.");
		else {
			for(int i = 0; i < q.length; i++) System.out.print(q[i]+"\t ");
			System.out.println();
		}
	}
}