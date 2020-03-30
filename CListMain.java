package CList;
public class CListMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLIst<String> s = new CLIst<String>(); //연결리스트 객체 s생성
		s.insert("pear"); s.insert("cherry");
		s.insert("orange"); s.insert("apple");
		s.print();
		System.out.print(": s의 길이 = " + s.size() + "\n");
		
		s.delete();
		s.print();
		System.out.print(": s의 길이 = " + s.size());System.out.println();
		
	}

}
