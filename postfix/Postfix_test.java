package postfix;

public class Postfix_test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optExp2 opt = new optExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n����ǥ��� : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n ������ = %d \n", result);
	}

}
