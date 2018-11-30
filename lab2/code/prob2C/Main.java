package prob2C;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student("James");
		Student stu2=new Student("Jack");
		
		Section sec1=new Section(stu1);
		sec1.addStudent(stu2);
		
		stu1.addSection(sec1);
		stu2.addSection(sec1);
		
	}

}
