package com.company;
import java.util.*;

public class Lesson7_BasicMaths {
    public static int countDigitsMeth1(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return  count;
    }

    public static int countDigitsMeth2(int n) {
        int digits = (int) Math.log10(n) + 1;
        return digits;
    }

    public static int reverseNumber(int n) {
        int result = 0;
        while (n > 0){
            int lastDigit = n % 10;
            result = result * 10 + lastDigit;
            n = n / 10;
        }
        return result;
    }

    public static boolean checkPalindrome(int n) {
        int result = 0;
        int origNum = n;
       while (n > 0) {
           int lastDigit = n % 10;
           n = n / 10;
           result = result * 10 + lastDigit;
       }
       if (origNum == result) return true;
       else return false;
    }

    public static boolean isArmstrong(int n) {
        int count = (int) Math.log10(n) + 1;
        int origNumber = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            sum = sum + (int) Math.pow(lastDigit, count);
        }
        if (sum == origNumber) return true;
        else return false;
    }

    public static List<Integer> printAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static List<Integer> printAllDivisorsMeth2(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) divisors.add(i);
            if (n/i != i && n % i == 0) divisors.add(n/i);
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static boolean checkForPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count == 2;
    }

    public static boolean checkForPrimeMeth2(int n) {
        int count = 0;
        for (int i = 1; i*i<=n; i++) {
            if (n % i == 0) count++;
            if (n/i % i != i && n % i == 0) count++;
        }
        return count == 2;
    }

    public static int gcdOrHcf(int n, int m) {
        int gcd = 1;
       int min = Math.min(n, m);
        for (int i = min; i >= 1 ; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static int gcdOrHcfMeth2(int n, int m) {
        int gcd = 1;
        while (n > 0 && m > 0) {
            if (n > m) n = n % m;
            else m = m % n;
        }
        if (n == 0) return m;
        else return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countDigitsMeth1(num));
//        System.out.println(countDigitsMeth2(num));
//        System.out.println(reverseNumber(num));
//        System.out.println(checkPalindrome(num));
//        System.out.println(isArmstrong(num));
//        System.out.println(printAllDivisors(num));
//        System.out.println(printAllDivisorsMeth2(num));
//        System.out.println(checkForPrimeMeth2(num));
        int num2 = sc.nextInt();
//        System.out.println(gcdOrHcf(num, num2));;
        System.out.println(gcdOrHcfMeth2(num, num2));;
    }

}
