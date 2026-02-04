package Hashing;

import java.util.Scanner;

public class CharHashing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input string
		String s = sc.next();

		// Hash for ASCII characters
		int[] hash = new int[256];

		// Precompute frequency
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			hash[ch]++;
		}

		// Queries
		int q = sc.nextInt();

		while (q-- > 0) {
			char c = sc.next().charAt(0);

			// Fetch frequency
			System.out.println(hash[c]);
		}

		sc.close();
	}
}
