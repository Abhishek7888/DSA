package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LogestSubArray_1 {

	static int[] longestSubArr(int[] arr, int n, int k) {
		int maxLength = 0;
		int start = -1, end = -1;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == k) {
					if (j - i + 1 > maxLength) {
						maxLength = j - i + 1;
						start = i;
						end = j;
					}
				}
			}
		}
		if (start == -1) {
			return new int[0];
		}
		int result[] = new int[maxLength];
		for (int i = 0; i < maxLength; i++) {
			result[i] = arr[start + i];
		}
		return result;

	}

	static int[] longestSubArr1(int[] arr, int n, int k) {
	    int left = 0, sum = 0, maxLength = 0;
	    int bestLeft = -1, bestRight = -1;

	    for (int right = 0; right < n; right++) {
	        sum += arr[right];

	        // shrink window if sum exceeds k
	        while (sum > k && left <= right) {
	            sum -= arr[left];
	            left++;
	        }

	        // check if sum matches k
	        if (sum == k) {
	            if (right - left + 1 > maxLength) {
	                maxLength = right - left + 1;
	                bestLeft = left;
	                bestRight = right;
	            }
	        }
	    }

	    if (bestLeft == -1) return new int[0]; // no subarray found

	    return Arrays.copyOfRange(arr, bestLeft, bestRight + 1);
	}
	static int[] longestSubArr3(int[] arr, int n, int k) {
	    Map<Integer, Integer> prefixMap = new HashMap<>();
	    int sum = 0, maxLength = 0;
	    int start = -1, end = -1;

	    for (int i = 0; i < n; i++) {
	        sum += arr[i];

	        if (sum == k) {
	            maxLength = i + 1;
	            start = 0;
	            end = i;
	        }

	        if (prefixMap.containsKey(sum - k)) {
	            int prevIndex = prefixMap.get(sum - k);
	            if (i - prevIndex > maxLength) {
	                maxLength = i - prevIndex;
	                start = prevIndex + 1;
	                end = i;
	            }
	        }

	        prefixMap.putIfAbsent(sum, i);
	    }

	    if (start == -1) return new int[0];

	    return Arrays.copyOfRange(arr, start, end + 1);
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
		int[] result = longestSubArr3(arr1, n, k);
		System.out.println("Longest SubArray : " + Arrays.toString(result));
	}

}
