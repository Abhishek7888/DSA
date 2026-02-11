package sorting;

import java.util.Scanner;

public class Selection_Sort {

	static void selectionSort(int arr[], int n) {
		for (int i = 0; i <= n - 2; i++) {
			int min = i;
			for (int j = i; j <= n - 1; j++) {
				if (arr[j] <= arr[min])
					min = j;
			}
			// swap
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

	}

	static void bubbleSort(int arr[], int n) {
		for (int i = n - 1; i >= 1; i--) {
			int didSwap = 0;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					didSwap = 1;
				}
			}
			if (didSwap == 0) {
				break;
			}
			System.out.println("runs");
		}
	}

	static void inserstionSort(int arr[], int n) {
		for (int i = 0; i <= n - 1; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arry Size :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter arry input :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		inserstionSort(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
