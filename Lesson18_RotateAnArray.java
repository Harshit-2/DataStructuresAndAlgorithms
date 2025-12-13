package com.company;

import java.util.*;

public class Lesson18_RotateAnArray {
    static int[] leftRotateAnArrayByOneDigit (int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    static int[] leftRotateAnArrayByNDigits(int[] arr, int n) {
        int[] temp = new int [n];

        if (n > arr.length) {
            n = n % arr.length;
        }
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < arr.length - n; i++) {
            arr[i] = arr[i + n];
        }
        for (int i = arr.length - n; i < arr.length; i++) {
            arr[i] = temp[n + i - arr.length];
        }
        return arr;
    }

    static int[] leftRotateAnArrayByNDigitsOptimized(int[] arr, int n) {
        if(n > arr.length) {
            n = n % arr.length;
        }
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            left = n;
            right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            left = 0;
            right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    static int[] moveZerosToEnd(int[] arr) {
        int[] tempArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                tempArr[i - count] = arr[i];
            } else {
                count += 1;
            }
        }
        for (int i = arr.length - count; i < arr.length; i++) {
            tempArr[i] = 0;
        }
        return tempArr;
    }

    static int[] moveZerosToEndMeth2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) return i + 1;
        }
        return -1;
    }

    static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        Set<Integer> unique = new HashSet();
        for (int el : arr1) unique.add(el);
        for (int el : arr2) unique.add(el);
        int[] arr = new int[unique.size()];
        int i = 0;
        for (int num : unique) {
            arr[i] = num;
            i++;
        }

        return arr;
    }

    static List <Integer> unionOfTwoSortedArraysOptimized(int[] arr1, int[] arr2) {
        ArrayList <Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        return  union;
    }

    static int[] intersectionOfTwoSortedArrays(int[] arr1, int[] arr2) {

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i) + ": ");
            arr[i] = sc.nextInt();
        }
//        System.out.print("Enter number of elements to left shift: ");
//        int rotateBy = sc.nextInt();

//        System.out.print("Left rotating an array by 1 digit: " + Arrays.toString(leftRotateAnArrayByOneDigit(arr)));
//        System.out.print("Left rotating an array by " + n +  " digit(s): " + Arrays.toString(leftRotateAnArrayByNDigits(arr, rotateBy)));
//        System.out.print("Left rotating an array by " + n +  " digit(s): " + Arrays.toString(leftRotateAnArrayByNDigitsOptimized(arr, rotateBy)));
//        System.out.print("Zeros moved to end: " + Arrays.toString(moveZerosToEnd(arr)));
//        System.out.print("Zeros moved to end: " + Arrays.toString(moveZerosToEndMeth2(arr)));
//        System.out.print("Element found at: " + linearSearch(arr, 4) + " index.");
        System.out.print("Enter size of 2nd array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter element " + (i) + ": ");
            arr2[i] = sc.nextInt();
        }
//        System.out.print("Union of 2 arrays is: " + Arrays.toString(unionOfTwoSortedArrays(arr, arr2)));
        System.out.print("Union of 2 arrays is: " + unionOfTwoSortedArraysOptimized(arr, arr2));
    }
}
