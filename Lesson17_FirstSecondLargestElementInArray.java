package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lesson17_FirstSecondLargestElementInArray {
    static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    static int[] sLargestAndSSmallestElementWithoutSorting(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int[] ans = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        ans[0] = secondLargest;
        ans[1] = secondSmallest;
        return ans;
    }
    
    static boolean checkIfArrayIsSorted(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] <= arr[i+1]) flag = true;
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static int removeDuplicatesFromSortedArray(int[] arr) {
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
//        System.out.println("Largest element found: " + findLargestElement(arr));
//        System.out.println("Second largest and second smallest elements found: " + Arrays.toString(sLargestAndSSmallestElementWithoutSorting(arr)));
//        System.out.print("Array sorted: " + checkIfArrayIsSorted(arr));
        System.out.print("After removing duplicates sorted array is: " + removeDuplicatesFromSortedArray(arr));
    }
}
