package array;

import java.util.Scanner;

public class BasicArray {

	// largest element in an array
	static void findLargest(int arr[], int n) {
		int largest = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest Element :" + largest);
	}

	// second largest element in an array
	static void sLargest(int arr[], int n) {
		int largest = arr[0];
		int sLargest = -1;
		for (int i = 1; i < n; i++) {
			if (arr[i] > largest) {
				sLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > sLargest) {
				sLargest = arr[i];
			}
		}
		System.out.println("Second Largest Element : " + sLargest);
	}

	// find array is sorted or not
	static boolean sortedA(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			if (arr[i] >= arr[i - 1]) {
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sortedA(arr, n));

	}
}
