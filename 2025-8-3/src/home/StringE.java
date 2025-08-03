package home;

import java.util.Scanner;

public class StringE {
    public static void main(String[] args) {
        //创建字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.nextLine();
        //反转字符串
        String s = new StringBuilder(str).reverse().toString();
        //判断字符串
        if(str.equals(s)){
            System.out.println("回文数");
        }else {
            System.out.println("不是");
        }
    }
}
