package com.company;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

class BubbleSort {
    int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int didSwap = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap += 1;
                }
            }
            if (didSwap == 0) break;
        }
        return arr;
    }
}

public class Lesson14_SelectionBubbleInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
//        System.out.print("After using Selection Sort: ");
//        SelectionSort ss = new SelectionSort();
//        System.out.println(Arrays.toString(ss.sort(arr)));

        System.out.print("After using Bubble Sort: ");
        BubbleSort bs = new BubbleSort();
        System.out.println(Arrays.toString(bs.sort(arr)));
    }
}
