package com.home;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {
//        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
//        int [] arr2 = new int[10];
//        System.arraycopy(arr1,6,arr2,2,3);
//        System.out.println(Arrays.toString(arr2));




        Runtime rtm =  Runtime.getRuntime();
        int a = rtm.availableProcessors();
        long b = rtm.maxMemory();
        System.out.println(b / 1024 / 1024);
    }

}
