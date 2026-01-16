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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		printNto1Back(1, a);

	}
}
