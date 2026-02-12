package sorting;

import java.util.Scanner;

public class Merge_Sort {

    static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int idx = low;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[idx++] = arr[left++];
        }
        while (right <= high) {
            temp[idx++] = arr[right++];
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    static void mS(int[] arr, int[] temp, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mS(arr, temp, low, mid);
        mS(arr, temp, mid + 1, high);
        merge(arr, temp, low, mid, high);
    }

    static void mergeSort(int[] arr, int n) {
        if (n <= 1) return;
        int[] temp = new int[n];
        mS(arr, temp, 0, n - 1);
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
        mergeSort(arr, n);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i < n - 1 ? " " : "\n"));
        }
        sc.close();
    }
}