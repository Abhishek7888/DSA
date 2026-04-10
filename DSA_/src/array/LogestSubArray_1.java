package array;

import java.util.Arrays;
import java.util.Scanner;

public class LogestSubArray_1 {

	static int[] longeshSubArr(int[] arr, int n, int k) {
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
		int[] result = longeshSubArr(arr1, n, k);
		System.out.println("Longest SubArray : " + Arrays.toString(result));
	}

}
