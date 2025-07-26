package com;

public class com {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(cun(arr,5));
    }

    public static boolean cun(int arr[],int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return true;
        }
        return false;
    }
}
