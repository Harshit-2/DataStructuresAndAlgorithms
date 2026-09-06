package com.company;
import java.util.Scanner;

public class Lesson9_Recursion {
    public static void printName(int i, int n) {
        if (i > n) return;
        System.out.println("Harshit");
        printName(i+1, n);
    }

    public static void printLinearNum(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        printLinearNum(i+1, n);
    }

    public static void printLinearNumInReverse(int n) {
       if (n == 0) return;
       System.out.print(n + " ");
       printLinearNumInReverse(n-1);
    }

    public static void printLinearNumByBacktracking(int i, int n) {
        if (i <= 0) return;
        printLinearNumByBacktracking(i-1, n);
        System.out.print(i + " ");
    }

    public static void printLinearNumInReverseByBacktracking(int i, int n) {
        if (i >= n) return;
        printLinearNumInReverseByBacktracking(i+1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
//        printName(1, n);
//        printLinearNum(1, n);
//        printLinearNumInReverse(n);
//        printLinearNumByBacktracking(n, n);
        printLinearNumInReverseByBacktracking(1, n);
    }
}
