package com;

public class f {
    public static void main(String[] args) {
        int arr [] = {1,9,8,3};
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+5;
            arr[i]=arr[i]%10;
        }
        int max = arr.length-1;
        int min = 0;
        for(int i=1;i<=(arr.length / 2);i++){
            int o = arr[min];
            arr[min]=arr[max];
            arr[max]=o;
            min++;
            max--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
