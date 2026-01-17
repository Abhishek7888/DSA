package rescursion;

import java.util.Scanner;

public class Recusrion {

	static int count = 0;

	static void printNum(int n) {
		if (count == 5) {
			return;
		}
		count++;
		System.err.println(count);
		printNum(n);
	}

	static void printName(int a, int b) {
		if (a > b) {
			return;
		}
		System.err.println("Abhi");
		printName(a + 1, b);
	}

	static void print1toN(int a, int b) {
		if (a > b) {
			return;
		}
		System.err.println(a);
		print1toN(a + 1, b);
	}

	static void printNto1(int a, int b) {
		if (a < 1) {
			return;
		}
		System.err.println(a);

		printNto1(a - 1, b);
	}

	// by backtracking
	static void print1toNback(int a, int b) {
		if (a < 1) {
			return;
		}
		print1toNback(a - 1, b);
		System.err.println(a);
	}

	// by backtracking
	static void printNto1Back(int a, int b) {
		if (a > b) {
			return;
		}
		printNto1Back(a + 1, b);
		System.err.println(a);
	}

	// by parameterized way
	static void printSum(int a, int sum) {
		if (a < 1) {
			System.out.println(sum);
			return;
		}
		printSum(a - 1, sum + a);
	}

	static int printSumf(int a) {
		if (a == 0) {
			return 0;
		}
		return a + printSumf(a - 1);

	}

	static int factorail(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorail(n - 1);

	}

	// Reverse array
	static void reverseArray(int i, int n, int arr[]) {
		if (i >= n / 2)
			return;
		swap(i, n - i - 1, arr);
		reverseArray(i + 1, n, arr);
	}

	// using single index
	static void reverseArrayS(int l, int r, int arr[]) {
		if (l >= r)
			return;
		swap(l, r, arr);
		reverseArray(l + 1, r - l - 1, arr);
	}

	static void swap(int l, int r, int arr[]) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

	static boolean palindrome(int i, int n, String[] s) {
		if (i >= n / 2)
			return true;
		if (s[i] != s[n - i - 1])
			return false;
		return palindrome(i + 1, n, s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		// printSum(a, 0);
		// System.out.println(factorail(a));

//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		reverseArrayS(0, n - 1, arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		palindrome(0, n-1, s);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

	}
}
