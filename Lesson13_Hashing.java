package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson13_Hashing {
    public static int hashUsingArray1(int n, int num, int[] arr) {
        //        precompute
        int[] hash = new int[101];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        return hash[num];
    }

    public static int hashUsingArray2 (char ch, int userArraySize, char[] arr) {
        int[] hash = new int[26];
        for (int i = 0; i < userArraySize; i++) {
            hash[arr[i] - 'a'] += 1;
        }
        return hash[ch - 'a'];
    }

    public static int hashUsingArray3 (char ch, int size, char[] arr) {
        int[] hash = new int[256];
        for (int i = 0; i < size; i++) {
            hash[arr[i]] += 1;
        }
        return hash[ch];
    }

    public static int hashUsingMap1(int num, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map.getOrDefault(num, 0);
    }

    public static void mapIteration(int num, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

//        to iterate in a map
        System.out.println("Elements in map are: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static int hashUsingMapInString(char ch, char[] arr) {
        Map<Character, Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map.getOrDefault(ch, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Int hash

//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter number to check its total occurrence: ");
//        int num = sc.nextInt();
//        System.out.println("Number of occurrence of " + num + " is: " + hashUsingArray1(n, num, arr));
//        System.out.println("Number of occurrence of " + num + " is: " + hashUsingMap1(num, arr));

//        mapIteration(num, arr);

        // Char hash
        System.out.print("Enter total number of characters: ");
        int m = sc.nextInt();
        char[] arr1 = new char[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.next().charAt(0);
        }

        System.out.print("Enter character to check it's occurrence: ");
        char ch = sc.next().charAt(0);

//        System.out.print("'" + ch + "' occurred: " + hashUsingArray2(ch, m, arr1) + " time(s).");
//        System.out.print("'" + ch + "' occurred: " + hashUsingArray3(ch, m, arr1) + " time(s).");
//        System.out.print("'" + ch + "' occurred: " + hashUsingMapInString(ch, arr1) + " time(s).");


        }
}
