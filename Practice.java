package com.company;

import java.util.*;

public class Practice {
   static List<Integer> unionOfTwoSortedArraysOptimized (int[] arr1, int[] arr2) {
       int i = 0;
       int j = 0;
       int n1 = arr1.length;
       int n2 = arr2.length;
       List<Integer> union = new ArrayList<>();
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
       return union;
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
