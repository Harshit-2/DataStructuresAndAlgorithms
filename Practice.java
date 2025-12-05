package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    static int remove(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
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

//        System.out.print("After using Bubble Sort: ");
//        BubbleSort bs = new BubbleSort();
//        System.out.println(Arrays.toString(bs.sort(arr)));

        System.out.println(remove(arr));
    }
}
