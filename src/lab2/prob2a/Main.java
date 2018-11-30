package lab2.prob2a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Jack");
		GradeReport g=new GradeReport();

		s.setGradeReport(g);
		g.setStudent(s);
		 
	}

}
