package collectionframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}

}

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.addLast(6);
		arrayList.addLast(2);
		arrayList.addLast(3);

		arrayList.sort(new MyComparator());
		System.out.println(arrayList);

		List<String> words = Arrays.asList("Apple", "Banana", "Orange");
		words.sort(new StringLengthComparator());
		System.out.println(words);

		arrayList.remove(Integer.valueOf(1));

		Collections.sort(arrayList);

		System.out.println(arrayList);

		Object[] obj = arrayList.toArray();
		arrayList.toArray(new Integer[0]);

//		List<String> list = new ArrayList<>();
//		System.out.println(list.getClass().getName());
//
//		List<String> list2 = Arrays.asList("Monday", "Tuesday");
//		System.out.println(list2.getClass().getName());
//
//		list.addAll(list2);
//		System.out.println(list);
//		String[] strings = { "Apple", "Banana" };
//		List<String> list3 = Arrays.asList(strings);
//		System.out.println(list3.getClass().getName());

//		ArrayList<Integer> arrayList = new ArrayList<>(11);
//		arrayList.add(10);
//		arrayList.add(20);
//		arrayList.add(30);
//		
//		arrayList.set(2, 50);
//
//		System.out.println(arrayList.get(2) + "\n");
//		System.out.println(arrayList.size()+ "\n");
//
////		for (int i = 0; i < arrayList.size(); i++) {
////			System.out.println(arrayList.get(i));
////		}
//		
//		for (Integer integer : arrayList) {
//			System.out.println(integer);
//		}
////		System.out.println(arrayList.contains(10));
////		System.out.println(arrayList.contains(50));
	}
}
