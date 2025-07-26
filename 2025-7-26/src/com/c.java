package com;

public class c {
    public static void main(String[] args) {
        int ret = 0;
        for (int i = 101; i < 201; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
                ret++;
            }
        }
        System.out.println("有"+ret+"个质数");
    }
}
