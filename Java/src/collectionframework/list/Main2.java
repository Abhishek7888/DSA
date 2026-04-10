package collectionframework.list;

import java.util.ArrayList;
import java.util.List;

class Student {

	String name;

	double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

}

public class Main2 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("Sai", 7.8));
		list.add(new Student("Abhi", 7.5));
		list.add(new Student("Luffy", 7.6));
		list.sort((a, b) -> a.getGpa() - b.getGpa());
		for (Student student : list) {
			System.out.println(student.getName() + ":" + student.getGpa());
		}
	}

}
