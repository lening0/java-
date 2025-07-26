package com;

import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int from = 1;
        int to = 3;
        int [] arr1 = copyOfRange(arr,from,to);
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]);
        }
    }

    public static int[] copyOfRange(int [] arr,int from,int to){
        int [] newArr = new int[to-from+1];
        for(int i=from;i<=to;i++){
             newArr[i-from]=arr[i];

        }
        return newArr;
    }
}




