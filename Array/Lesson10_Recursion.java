package com.company;
import java.util.Scanner;

public class Lesson10_Recursion {
    public static int sumOfNNumbers(int i, int n, int sum) {
        if (i > n) return sum;
        sum = sum + i;
        sumOfNNumbers(i + 1, n, sum);
        return sumOfNNumbers(i + 1, n, sum);
    }

    public static int sumOfNNumbersMeth2(int n) {
        if (n == 0) return 0;
        return n + sumOfNNumbersMeth2(n-1);
    }

    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(sumOfNNumbers(1, n, 0));
//        System.out.println(sumOfNNumbersMeth2(n));
        System.out.println(calculateFactorial(n));
    }
}
