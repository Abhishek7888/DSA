package collectionframework.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>(11, 0.3f, true);

		hashMap.put("Apple", 10);
		hashMap.put("Orange", 20);
		hashMap.put("Banana", 15);

		hashMap.get("Apple");

		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry);

		}

		HashMap<String, Integer> map = new HashMap<>();
		LinkedHashMap<String, Integer> hashMap2 = new LinkedHashMap<>(map);
		map.put("Sai", 91);
		map.put("Vivek", 90);
		map.put("Abhi", 92);

		Integer res = map.getOrDefault("Abhi", null);
		System.out.println(res);

	}

}
