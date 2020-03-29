package gu;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] a = {
				new Student(14001,"권나라", "국어", 5), new Student(12001, "김다미", "디자인", 1),
				new Student(14003,"김동희", "수학", 4), new Student(12002, "박서준", "호텔조리", 2),
				new Student(14002,"이다윗", "법과정치", 3), new Student(12004, "손예진", "컴퓨터", 3),
				new Student(14004,"현빈", "지리", 2), new Student(12005, "최예나", "컴퓨터", 4),
				new Student(14005,"김채원", "수학", 1), new Student(12003, "조유리", "컴퓨터", 5)		
		};
		Arrays.sort(a);
		print(a, "ID");
		
		Arrays.sort(a, Student.WITH_DEPT);
		print(a, "학과");
		
		Arrays.sort(a, Student.WITH_NAME);
		print(a, "이름");
		
		Arrays.sort(a, Student.WITH_GRADE);
		print(a, "학년");	
		
	}

	private static void print(Student[] a, String string) {
		// TODO Auto-generated method stub
	      System.out.println("===================================");
	      System.out.println(string);
	      for(Student s : a) {
	         System.out.println(s.toString());
		
	}
}
}

