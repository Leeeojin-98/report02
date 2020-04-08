package infix_to_postfix;
import java.util.Scanner;
import java.util.Stack;

public class infix_to_postfix {
	public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String string;

            System.out.println("중위식 계산식: ");
            string = scanner.nextLine();

            System.out.println("후위표현식:" + change(string));
    }
	
	private static int operatorPriority(char operator) {
        if(operator == '(') return 0;
        if(operator == '+' || operator == '-') return 1;
        if(operator == '*' || operator == '/') return 2;
        return 3;
    }
 
    public static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    public static boolean isChar(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z')|| (ch >= 'a' && ch <= 'z');
    }
   
    public static String change(String string){
        char ch;
        StringBuffer buffer = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            } 
            else if(string.charAt(i) == ')') {
                while((ch = (Character)stack.pop()) != '(') {
                    buffer.append(ch);
                    buffer.append(' ');
                }
            } 
            else if(isOperator(string.charAt(i))) { 
                while(!stack.isEmpty() && operatorPriority((Character)stack.peek()) >= operatorPriority(string.charAt(i))) {
                	buffer.append(stack.pop());
                	buffer.append(' ');
                }
                stack.push(string.charAt(i));
            } 
            else if(isChar(string.charAt(i))) {
                do {
                	buffer.append(string.charAt(i++));
                } while(i<string.length() && isChar(string.charAt(i)));
                buffer.append(' '); i--;
            }
        }
        while(!stack.isEmpty()) {
        	buffer.append(stack.pop());
        	buffer.append(' ');
        }
        return buffer.toString();
    }
}