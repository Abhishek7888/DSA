package collectionframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		System.out.println(list.getClass().getName());

		List<String> list2 = Arrays.asList("Monday", "Tuesday");
		System.out.println(list2.getClass().getName());

		list.addAll(list2);
		System.out.println(list);
		String[] strings = { "Apple", "Banana" };
		List<String> list3 = Arrays.asList(strings);
		System.out.println(list3.getClass().getName());

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
