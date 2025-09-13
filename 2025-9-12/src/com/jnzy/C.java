package com.jnzy;

import java.util.Random;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        System.out.println("----------猜数字------------");
        System.out.println("猜数字游戏开始，目标范围是1—100");
        Random random = new Random();
        int num = random.nextInt(1,101);
        int num1 = 0;
        while (num != num1){
            System.out.println("请输入");
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();
            if (num >= num1){
                System.out.println("猜小了");
            }else {
                System.out.println("猜大了");
            }
        }
        System.out.println("恭喜你，猜对了");

    }
}
