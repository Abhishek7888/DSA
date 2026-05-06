package collectionframework.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Sai");
		map.put(2, "Abhi");
		map.put(3, "Sushanshu");
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(5));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Sai"));

		Set<Integer> keys = map.keySet();

		for (Integer integer : keys) {
			System.out.println(map.get(integer));
		}

		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for (Map.Entry<Integer, String> entry : entries) {
			entry.setValue(entry.getValue().toUpperCase());
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println(map);

		map.remove(1);
		System.out.println(map);

		System.out.println(map.remove(2, "ABHI"));
		System.out.println(map);
	}

}
