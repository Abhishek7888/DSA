package collectionframework.list;

public class Hash {

	public static void main(String[] args) {
		
		System.out.println(simplehash("ABC"));
		System.out.println(simplehash("CAB "));

	}

	public static int simplehash(String key) {

		int sum = 0;
		for (char c : key.toCharArray()) {
			sum += c;
		}
		return sum % 10;

	}

}
