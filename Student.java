package gu;
import java.util.Comparator;

public class Student implements Comparable<Student>{
	public static final Comparator<Student> WITH_NAME = new WithName();
	public static final Comparator<Student> WITH_DEPT = new WithDept();
	public static final Comparator<Student> WITH_GRADE = new WithGrade();
	
	  int ID;
	   String name;
	   String dept;
	    Integer grade;
	   
	   public Student(int IDIn, String nameIn, String deptIn, int gradeIn) {
	      ID = IDIn;
	      name = nameIn;
	      dept = deptIn;
	      grade = gradeIn;
	   }
	   public int getID() {      return ID;   }

	   public String getName() {      return name;   }

	   public String getDept() {      return dept;   }

	   public int getGrade() {      return grade;   }
	   @Override
	   public int compareTo(Student s1) {
	      // TODO Auto-generated method stub
	      return this.ID - s1.ID;
	   }
	   
	   @Override
	   public String toString() {
	      return "Student [ID=" + ID + ", name=" + name + ", dept=" + dept + ", grade=" + grade + "]";
	   }


	   public static class  WithName implements Comparator<Student> {
	      public int compare(Student s1, Student s2) {
	         return s1.name.compareTo(s2.name);
	      }
	   }
	   public static class WithDept implements Comparator<Student> {
	      public int compare(Student s1, Student s2) {
	         return s1.dept.compareTo(s2.dept);
	      }   
	   }
	   public static class WithGrade implements Comparator<Student> {
	      public int compare(Student s1, Student s2) {
	         return s1.grade.compareTo(s2.grade);
	      }
	   }
}
	   
