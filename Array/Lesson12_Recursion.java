package com.company;
import java.util.Scanner;

public class Lesson12_Recursion {
    public static int fibonacciNthTerm (int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        return fibonacciNthTerm(n-1) + fibonacciNthTerm(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacciNthTerm(n));
    }
}
