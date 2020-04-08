package palinderome;
import java.util.Scanner;

public class palindromemain{
	public static void main(String args[]) {
	String string;
	Scanner scanner = new Scanner(System.in);
	boolean palin = true;
	string = scanner.nextLine();
	
	while (!string.equals("q")) {
		char[] array = string.toCharArray();
		palindrome b = new palindrome(string.length());
		
		for (int i = 0; i < array.length / 2; i++) {
			b.push(array[i]);
		}

		if (string.length() % 2 == 1) {
			for (int j = 0; j < array.length / 2; j++) {
				if (b.pop() == array[array.length / 2 + j + 1])
					palin = true;
				else {
					palin = false;
					break;
				}
			}
		}
	
		if (string.length() % 2 == 0) {
			for (int j = 0; j < array.length / 2; j++) {
				if (b.pop() == array[array.length / 2 + j])
					palin = true;
				else {
					palin = false;
					break;
				}
			}
		}
		
		if (palin == true)
			System.out.println("회문입니다.");
		else if (palin == false) {
			System.out.println("회문이 아닙니다.");
		}
		string = scanner.nextLine();
	}
	
	while(true){
		if(string.equals("q"))
				System.out.println("종료");
		break;
		}
	}
}