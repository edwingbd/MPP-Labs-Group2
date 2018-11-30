package prob2A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Jack");
		GradeReport g=new GradeReport();

		s.setGradeReport(g);
		g.setStudent(s);
		 
	}

}
