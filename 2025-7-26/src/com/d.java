package com;

import java.util.Random;

public class d {
    public static void main(String[] args) {
        char [] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25){
                chs [i] = (char)(i+97);
            } else {
                chs [i] = (char)(i+39);
            }
        }
        for (int i = 0; i < 5; i++) {
            Random r = new Random();
            int n = r.nextInt(52);
            if (i < 4){
                System.out.print(chs[n]);
        }else{
                int o = r.nextInt(10);
                System.out.print(o);
            }
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]);
        }
    }
}
