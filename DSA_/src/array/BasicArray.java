package array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

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

	// remove duplicates in place from sorted array

	// brute force
	static void removeDuplicates(int arr[], int n) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}
		int index = 0;
		for (Integer integer : set) {
			arr[index++] = integer;
		}
		System.out.println(" Unique Array ");
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// optimal approach

	static void removeD(int arr[], int n) {
		int i = 0;
		for (int j = 1; j < n; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];

			}
		}
		for (int j = 0; j <= i; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	// left rotate array by 1 place

	static void leftRotate(int arr[], int n) {
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// left rotate array by d places

	static void leftRotatByN(int arr[], int n, int d) {
		d = d % n;
		int temp[] = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		for (int j = d; j < n; j++) {
			arr[j - d] = arr[j];
		}
		for (int k = n - d; k < n; k++) {
			arr[k] = temp[k - (n - d)];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void leftRotateByN2(int arr[], int n, int d) {

		// Step 1: Reverse first d elements
		reverse(arr, 0, d - 1);

		// Step 2: Reverse remaining n-d elements
		reverse(arr, d, n - 1);

		// Step 3: Reverse the whole array
		reverse(arr, 0, n - 1);

		// Print result
		System.out.println(Arrays.toString(arr));

	}

	static void reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	// Move all zeros to the end of array

	// Brute Force approach
	static void moveZeroToEnd(int arr[], int n) {

		// step -1 Move non zero elements into temp array
		int temp[] = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				temp[index++] = arr[i];
			}
		}

		// step - 2 Move temp array elements to array

		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		int nonZero = temp.length;

		// step - 3 fill remaining array with zeros

		for (int i = nonZero; i < n; i++) {
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));

	}

	// Move all zeros to the end of array

	// Optimal approach Force approach
	static void moveZeroToEnd2(int arr[], int n) {
		int j = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}
		if (j == -1) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for (int i = j + 1; i < n; i++) {
			if (arr[i] != 0) {
				swap(arr, i, j);
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	static int[] swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		return arr;
	}

	// Linear Search
	static void linearSearch(int arr[], int n, int number) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == number) {
				System.out.println(number + " Number is founded at index : " + i);
				return;
			} else {
				System.out.println("Number is not present in the array");
			}
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
//		System.out.println("Enter rotation's");
//		int d = sc.nextInt();

		System.out.println(" Enter number to search ");
		int num = sc.nextInt();
		linearSearch(arr, n, num);

	}
}
