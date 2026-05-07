package collectionframework.list;

import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private int capacity;

	public LRUCache(int capacity) {

		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return size() > capacity;
	}

	public static void main(String[] args) {

		LRUCache<String, Integer> cache = new LRUCache<>(3);
		cache.put("Alis", 99);
		cache.put("Ram", 92);
		cache.put("Scott", 99);
		cache.put("Shyam", 100);
		cache.get("Alis");
		System.out.println(cache);

	}
}
