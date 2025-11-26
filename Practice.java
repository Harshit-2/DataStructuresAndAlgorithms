package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {
    public static int[] fxn(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) > max) max = arr[i];
            if (map.get(i) < min) min = arr[i];
        }
        int[] result = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum and maximum occurring elements in array are: " + Arrays.toString(fxn(arr)) + " respectively.");
    }
}