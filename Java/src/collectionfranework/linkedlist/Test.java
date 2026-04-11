package collectionfranework.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Node {

	public int value;
	public Node next;

}

public class Test {

	public static void main(String[] args) {

//		Node node1 = new Node();
//		Node node2 = new Node();
//		node1.value = 1;
//		node2.value = 2;
//		node1.next = node2;
//		node2.next = null;

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		System.out.println(linkedList.get(1));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.remove(1));

		linkedList.removeIf(x -> x % 2 == 0);
		System.out.println(linkedList);

		LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat", "Dog", "Cow"));
		LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
		animals.removeAll(animalsToRemove);
		System.out.println(animals);

	}
}
