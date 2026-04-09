package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubArray {

	// 1) Brute force approach using two pointers
	static int longestSubArray(int arr[], int n, int k) {
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == k) {
					maxLength = Math.max(maxLength, j - i + 1);
				}
			}
		}
		return maxLength;
	}

	// 2) Better approach using hashing which work for positives and negatives also
	static int longestSubArray1(int arr[], int n, int k) {
		int maxLength = 0;
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			sum += arr[i];

			// Case 1: sum itself equals k
			if (sum == k) {
				maxLength = i + 1;
			}

			// Case 2: check if (sum - k) exists
			int remaining = sum - k;
			if (map.containsKey(remaining)) {
				int length = i - map.get(remaining);
				maxLength = Math.max(maxLength, length);
			}

			// Store sum only if not already present (important)
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}

		return maxLength;
	}

	// 3) Optimal approach using two pointers for positives only
	static int longestSubArray2(int arr[], int n, int k) {
		int maxLength = 0, right = 0, left = 0, sum = 0;
		while (right < n) {
			while (left <= right && sum > k) {
				sum -= arr[left];
				left++;	
			}
			if (sum == k) {
				maxLength = Math.max(maxLength, right - left + 1);
			}
			right++;
			if (right < n) {
				sum += arr[right];
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter sum ");
		int k = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();

		}
		System.out.println(longestSubArray2(arr1, n, k));
	}
}
