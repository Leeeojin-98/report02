package gu;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] a = {
				new Student(14001,"�ǳ���", "����", 5), new Student(12001, "��ٹ�", "������", 1),
				new Student(14003,"�赿��", "����", 4), new Student(12002, "�ڼ���", "ȣ������", 2),
				new Student(14002,"�̴���", "������ġ", 3), new Student(12004, "�տ���", "��ǻ��", 3),
				new Student(14004,"����", "����", 2), new Student(12005, "�ֿ���", "��ǻ��", 4),
				new Student(14005,"��ä��", "����", 1), new Student(12003, "������", "��ǻ��", 5)		
		};
		Arrays.sort(a);
		print(a, "ID");
		
		Arrays.sort(a, Student.WITH_DEPT);
		print(a, "�а�");
		
		Arrays.sort(a, Student.WITH_NAME);
		print(a, "�̸�");
		
		Arrays.sort(a, Student.WITH_GRADE);
		print(a, "�г�");	
		
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

