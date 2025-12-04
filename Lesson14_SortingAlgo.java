package com.company;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            int temp = arr[i];
            arr[indexOfMin] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

class BubbleSort {
    int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
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

class InsertionSort {
    int[] sort(int[] arr) {
        int key, j;
        for (int i = 1; i <= arr.length - 1; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}

class MergeSort {
    void merge (int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] tempArr = new int[arr.length];

        while(i <= mid && j <= high) {
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
        for (int l = low; l <= high; l++) {
            arr[l] = tempArr[l];
        }
    }

    int[] mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }
}

class QuickSort {
    int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        do {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } while (i < j);

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    int[] quickSort(int[] arr, int low, int high) {
        int partitionIndex;
        if (low < high) {
            partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
        return arr;
    }
}

public class Lesson14_SortingAlgo {
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
        
//        System.out.print("After using Insertion Sort: ");
//        InsertionSort is = new InsertionSort();
//        System.out.println(Arrays.toString(is.sort(arr)));

//        System.out.print("After using Merge Sort: ");
//        MergeSort is = new MergeSort();
//        System.out.println(Arrays.toString(is.mergeSort(arr, 0, arr.length - 1)));

        System.out.print("After using Quick Sort: ");
        QuickSort is = new QuickSort();
        System.out.println(Arrays.toString(is.quickSort(arr, 0, arr.length - 1)));
    }
}
