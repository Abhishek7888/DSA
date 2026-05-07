package collectionframework.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEquals {

	public static void main(String[] args) {

		HashMap<Person, String> hashMap = new HashMap<>();

		Person p1 = new Person("Abhi", 1);
		Person p2 = new Person("sai", 2);
		Person p3 = new Person("Abhi", 1);

		hashMap.put(p1, "Engineer");
		hashMap.put(p2, "Doctor");
		hashMap.put(p3, "Engineer");

		Map<String, Integer> map = new HashMap<>();
		map.put("Abhi", 90);
		map.put("Neha", 85);
		map.put("Abhi", 99);

		System.out.println("HashMap Size : " + hashMap.size());
		System.out.println("Value of p1 : " + hashMap.get(p1));
		System.out.println("Value of p3 : " + hashMap.get(p3));

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

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;

		return id == other.getId() && Objects.equals(name, other.getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : " + id + ", name :" + name;
	}

}