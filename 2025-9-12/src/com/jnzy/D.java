package com.jnzy;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        //判断有多少个四叶玫瑰
        //定义有count
        int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i /100 % 10;
            int qian = i / 1000 % 10;
            double num = Math.pow(ge,4)+Math.pow(shi,4)+Math.pow(bai,4)+Math.pow(qian,4);
            if (num == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("共"+count+"个");
    }
}
