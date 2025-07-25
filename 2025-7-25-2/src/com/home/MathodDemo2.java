package com.home;

import java.util.Scanner;

public class MathodDemo2 {
    public static void main(String[] args) {
       // all();
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        ret(x,y);
        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        System.out.println(4 * SS(r));
        int len1 = sc.nextInt();
        int wid1 = sc.nextInt();
        int len2 = sc.nextInt();
        int wid2 = sc.nextInt();
        System.out.println(bi(len1,wid1,len2,wid2));

    }
//    public static void all(){
//        System.out.println("170");
//        System.out.println("男");
//        System.out.println("135");
//        System.out.println("月薪30k");
//    }
//    public static void ret(int i,int j){
//        System.out.println(i * j);
//    }
//    public static double SS(int r){
//        return  r*r*3.14;
//    }
    public static int bi(int x, int y, int i, int j){
        if (x*y > i*j){
            return 1;
        }else {
            return 2;
        }
    }

}













