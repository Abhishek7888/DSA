package collectionframework.list;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);

		System.out.println(arrayList.get(1) + "\n");
		System.out.println(arrayList.size()+ "\n");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println(arrayList.contains(10));
		System.out.println(arrayList.contains(50));
	}
}
