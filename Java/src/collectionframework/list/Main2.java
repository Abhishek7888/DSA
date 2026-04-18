package collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		list.add(new Student("Luffy", 7.5));

		Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed()
				.thenComparing(Student::getName);

		list.sort(comparator);

		list.sort((a, b) -> {
			if (b.getGpa() - a.getGpa() > 0) {
				return 1;
			} else if (a.getGpa() - b.getGpa() < 0) {
				return -1;
			} else {
				return a.getName().compareTo(b.getName());
			}
		});
		
		Collections.sort(list,comparator);
		for (Student student : list) {
			System.out.println(student.getName() + ":" + student.getGpa());
		}
	}

}
