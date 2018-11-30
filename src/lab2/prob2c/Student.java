package lab2.prob2c;

import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Section> sectons;
	 
	public Student(String _name) {
		this.name=_name;
		this.sectons=new ArrayList<Section>();
	}
	
	public void addSection(Section _section) {
		sectons.add(_section);
	}
}
