package home;

import java.util.Scanner;

public class StringA {
    public static void main(String[] args) {
        String rightUsername = "lxn";
        String rightPassword = "123456";
        System.out.println("请输入用户");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        if("lxn".equals(username) && "123456".equals(password)){
            System.out.println("输入成功");
        }else {
            for (int i = 1; i < 3; i++) {
                System.out.println("输入失败你还有"+(3-i)+"次机会");
                System.out.println("请输入用户");
                String username1 = sc.nextLine();
                System.out.println("请输入密码");
                String password1 = sc.nextLine();
                if("lxn".equals(username1) && "123456".equals(password1)){
                    System.out.println("输入成功");
                    break;
                }
            }
            System.out.println("输入达到上限");
        }
    }
}
