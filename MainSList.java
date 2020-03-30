package SList;

public class MainSList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sList<String> s = new sList<String>(); //연결리스트 객체 s 생성
		s.insertFront("orange"); s.insertFront("apple");
		s.insertAfter("cherry",s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println(": s 의 길이 = "+s.size()+"\n");
		System.out.println("체리가 \t" + s.search("cherry")+"번째에 있다.");
		System.out.println("키위가 \t" + s.search("kiwi")+"번째에 있다.");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이= "+s.size()); System.out.println();
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이= "+s.size()); System.out.println();
		
		sList<Integer> t = new sList<Integer>(); //연결리스트 객체 t 생성
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400,t.head);
		t.insertFront(100);
		t.insertAfter(300,t.head.getNext());
		t.print();
		System.out.println(": t의 길이 = "+ t.size());
	}

}
