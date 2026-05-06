package collectionframework.list;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {

	public static void main(String[] args) {

		HashMap<Person, String> hashMap = new HashMap<>();

		Person p1 = new Person("Abhi", 1);
		Person p2 = new Person("sai", 2);
		Person p3 = new Person("Abhi", 1);

		hashMap.put(p1, "Engineer");
		hashMap.put(p2, "Doctor");
		hashMap.put(p1, "Teacher");

		Map<String, Integer> map = new HashMap<>();
		map.put("Abhi", 90);
		map.put("Neha", 85);
		map.put("Abhi", 99);

		System.out.println("HashMap Size : " + hashMap.size());
		System.out.println("Value of p1 : " + hashMap.get(p1));
		System.out.println("Valyue of p2 : " + hashMap.get(p3));
		
		System.out.println(p1);

	}
}

class Person {

	String name;
	int id;

	public Person(String name, int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;

	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : " + id + ", name :" + name;
	}

}