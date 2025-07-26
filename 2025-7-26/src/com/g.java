package com;
//1983
public class g {
    public static void main(String[] args) {
        int arr [] = {8,3,4,6};
        int max = arr.length-1;
        int min = 0;
        for(int i=1;i<=(arr.length / 2);i++){
            int o = arr[min];
            arr[min]=arr[max];
            arr[max]=o;
            min++;
            max--;
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 5 && arr[i] >= 0){
                arr[i]=arr[i] + 10;
            }
            arr[i]=arr[i]-5;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
