package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

class MergeSort1 {
    void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] tempArr = new int [arr.length];
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
                k++;
            } else {
                tempArr[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            tempArr[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            tempArr[k] = arr[j];
            j++;
            k++;
        }
        for (int l = low; l <= high ; l++) {
            arr[l] = tempArr[l];
        }
    }

    int[] mergeSort (int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }
}

public class Practice {
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

        System.out.print("After using Merge Sort: ");
        MergeSort1 is = new MergeSort1();
        System.out.println(Arrays.toString(is.mergeSort(arr, 0, arr.length - 1)));
    }
}
