package lab2.prob2c;

import java.util.ArrayList;

public class Section {
	
	private ArrayList<Student> students;
	
	public Section(Student _student) {
		students=new ArrayList<Student>();
		students.add(_student);
	}
	
	public void addStudent(Student _student) {
		students.add(_student);
	}

}
