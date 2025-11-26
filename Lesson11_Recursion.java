package com.company;
import java.util.Scanner;

public class Lesson11_Recursion {
    public static int[] reverseArrayUsingRecursion(int l, int r, int[] arr) {
        if (l >= r) return arr;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverseArrayUsingRecursion(l+1, r-1, arr);
    }

    public static boolean isPalindromeString(String str, int l, int r) {
        if (l >= r) return true;
        if (str.charAt(l) != str.charAt(r)) {
            return false;
        }
        return isPalindromeString(str, l+1, r-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(reverseArrayUsingRecursion(0, n - 1, arr)));
        String str = sc.next();
        System.out.println(isPalindromeString(str, 0, str.length()-1));
    }
}
