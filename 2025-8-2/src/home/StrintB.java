package home;

import java.util.Scanner;

public class StrintB {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
