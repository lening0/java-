package com;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //机票原价为n
        int n = sc.nextInt();
        //录入月份为m
        int m = sc.nextInt();
        //舱位为k
        String k = sc.next();
        //调用方法
        System.out.println(ji(n, m, k));

    }

    public static double ji(int n, int m, String k) {
        if (n > 4 && n < 11) {
            if (k.equals("头等舱")) {
                return n * 0.9;
            }else {
                return n * 0.85;
            }
                }
        else {
            if (k.equals("头等舱")) {
                return n * 0.7;
            }else  {
                return n * 0.65;
            }
        }
    }


}






























































































































































































