package collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CopyOnArrayListDemo {

	public static void main(String[] args) {
		


		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Initial  list" + list);
		

		

		Iterator<Integer> itr = list.listIterator();

		while (itr.hasNext()) {
			itr.next();
			list.add(5);
//			System.out.println(itr.next());
		}
		System.out.println("Updated list " + list);


//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
	}
}
