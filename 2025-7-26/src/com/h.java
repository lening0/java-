package com;

import java.util.Random;

public class h {
    public static void main(String[] args) {
        String [] arr = {"2送出","588送出","888送出","1000送出","10000送出"};
        String [] newarr = new String[arr.length];
        for(int i=0;i<arr.length;){
            Random random = new Random();
            int o = random.nextInt(arr.length);
            if(contains(newarr,arr[o],i)){
                newarr[i]=arr[o];
                i ++;
            }
        }
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }
    }
    public static boolean contains(String[] arr, String str , int p){
        for(int i=0;i<p;i++){
            if(arr[i].equals(str)){
                return false;
            }
        }
        return true;
    }
}
