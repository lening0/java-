package com;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            arr [i] = a;
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println((sum-min-max) / 4);
    }
}
