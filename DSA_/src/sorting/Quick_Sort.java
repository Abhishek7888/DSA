package sorting;

import java.util.Scanner;

public class Quick_Sort {

	static int partition(int arr[], int low, int high) {

		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {
			while (arr[i] <= pivot && i <= high - 1) {
				i++;
			}
			while (arr[j] >= pivot && j >= low + 1) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		return j;

	}

	static void qS(int arr[], int low, int high) {
		if (low < high) {
			int pIndex = partition(arr, low, high);
			qS(arr, low, pIndex - 1);
			qS(arr, pIndex + 1, high);
		}
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
		qS(arr, 0, n - 1);
		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + (i < n - 1 ? " " : "\n"));
		}
		sc.close();
	}
}
