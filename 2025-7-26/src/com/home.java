package com;

public class home {
    public static void main(String[] args) {
        //1.定义数组
        int [] arr = {1,2,3,4,5};
//        printArr(arr);
        System.out.println(max(arr));



    }
//    public static void printArr(int [] arr) {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            if (i != arr.length - 1) {
//                System.out.print(arr[i] + ",");
//            }else  {
//                System.out.print(arr[i]);
//            }
//        }
//        System.out.println("]");


    public static int max(int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
    }
        return max;
    }
}











