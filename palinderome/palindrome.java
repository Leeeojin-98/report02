package palinderome;
import java.util.Scanner;
import java.io.PrintStream;

interface Stack{
	boolean isEmpty();
	boolean isFull();
	void push(char item);
	char pop();
}

public class palindrome implements Stack{
	
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public palindrome(int stackSize){
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}

	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == this.stackSize-1);
	}
	
	public void push(char item){
		if(isFull()){
			System.out.println("Inserting fail! Array Queue is full");
		}else{
			itemArray[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("Deleting fail! Array queue is empty!!");
			return 0;
		}else{
			return itemArray[top--];
		}
	}
}