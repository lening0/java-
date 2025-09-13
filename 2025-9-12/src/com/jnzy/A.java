package com.jnzy;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        System.out.println("-----------积分兑换小程序----------");
        System.out.println("1.铅笔需要1积分");
        System.out.println("2.橡皮需要2积分");
        System.out.println("3.作业本需要3积分");
        System.out.println("4.文具盒需要5积分");
        System.out.println("请输入你要兑换的物品");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 20;
        while (true) {
            switch (num) {
                case 1 ->System.out.println("您还剩："+(sum-1)+"积分，是否进行兑换（是继续输入编号，否输入0）");
                case 2 ->System.out.println("您还剩："+(sum-2)+"积分，是否进行兑换（是继续输入编号，否输入0）");
                case 3 ->System.out.println("您还剩："+(sum-3)+"积分，是否进行兑换（是继续输入编号，否输入0）");
                case 4 ->System.out.println("您还剩："+(sum-5)+"积分，是否进行兑换（是继续输入编号，否输入0）");
            }
            if (num == 0){
                break;
            }
            num = sc.nextInt();
        }

    }
}
