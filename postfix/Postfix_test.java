package postfix;

public class Postfix_test {
	public static void main(String[] args) {
		optExp2 opt = new optExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("후위표기식 : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n연산결과 = %d \n", result);
	}
}
