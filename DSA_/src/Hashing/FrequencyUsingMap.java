package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyUsingMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input size
		int n = sc.nextInt();

		// Input array
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Precompute frequency using HashMap
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			int val = arr[i]; // ✅ Use array value

			map.put(val, map.getOrDefault(val, 0) + 1);
		}

		// Queries
		int q = sc.nextInt();

		while (q-- > 0) {

			int number = sc.nextInt();

			// Fetch frequency
			System.out.println(map.getOrDefault(number, 0));
		}

		sc.close();
	}
}
