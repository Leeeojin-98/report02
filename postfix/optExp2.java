package postfix;
class optExp2 {
	private String exp;
	
	public int evalPostfix(String postfix) {
		LinkedStack S = new LinkedStack();
		exp = postfix;
		int opr1, opr2, value;
		char testCh;
		for(int i = 0; i<7; i++) {
			testCh = exp.charAt(i);
			if(testCh != '+'  && testCh != '-' && testCh != '*' && testCh != '/'){
					value = testCh - '0';
					S.push(value);
			}
			else {
				opr2 = S.pop();
				opr1 = S.pop();
				switch(testCh) {
				case '+' : S.push(opr1 + opr2); break;
				case '-' : S.push(opr1 - opr2); break;
				case '*' : S.push(opr1 * opr2); break;
				case '/' : S.push(opr1 / opr2); break;
				} 
			}
		}
		return S.pop();
	}
}
