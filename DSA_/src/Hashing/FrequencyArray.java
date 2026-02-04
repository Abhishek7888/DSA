package Hashing;

import java.util.Scanner;

public class FrequencyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// precompute
			int[] hash = new int[13];
			for (int i = 0; i < arr.length; i++) {
				hash[arr[i]]++;
			}

		int q = sc.nextInt();
		while (q > 0) {
			int number = sc.nextInt();
			System.out.println(hash[number]);
			q--;
			// fetch
		}

	}

}
