package collectionframework.list;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(5);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		System.out.println(vector.capacity());
		LinkedList<Integer> inList = new LinkedList<>();
		inList.add(10);
		inList.add(20);
		inList.add(30);
		inList.add(40);
		Vector<Integer> vector2 = new Vector<>(inList);
		System.out.println(vector2); 
		System.out.println(vector2.size());
		for (Integer integer : vector2) {
			System.out.println(integer);
		}
		

	}

}
