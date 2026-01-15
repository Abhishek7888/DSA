package basic_maths;

import java.util.Scanner;

public class BasicMaths {

	// Count the no of Digits
	public static void countDigits(int n) {
		int count = 0;
		while (n > 0) {
			int lastD = n % 10;
			count++;
			n /= 10;

		}
		System.out.println(count);
	}

	// Reverse a Number
	public static void reverseNumber(int n) {
		int rev = 0;
		while (n > 0) {
			int lastD = n % 10;
			rev = (rev * 10) + lastD;
			n /= 10;

		}
		System.out.println(rev);
	}

	// palindrome Number
	public static void palindrome(int n) {
		int original = n;
		int rev = 0;
		while (n > 0) {
			int lastD = n % 10;
			rev = (rev * 10) + lastD;
			n /= 10;
		}
		if (rev == original)
			System.out.println("true");
		else
			System.out.println("false");
	}

	// armstrong Number
	public static void armstrongNum(int n) {
		int org = n;
		int sum = 0;
		while (n > 0) {
			int ld = n % 10;
			sum += (ld * ld * ld);
			n /= 10;
		}
		if (sum == org)
			System.out.println(sum + " is armstrong number");
		else
			System.out.println(sum + " is not armstrong number");
	}

	// print all divisors
	public static void printDivisor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// check prime number
	public static void checkPrime(int n) {
		int count = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				count++;
				if ((n % i) != i) {
					count++;
				}
			}
		}
		if (count == 2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void gcd(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}
		if (a == 0)
			System.out.println(b);
		else
			System.out.println(a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		gcd(num, num2);

	}

}
