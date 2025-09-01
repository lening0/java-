package home;

import java.util.ArrayList;
import java.util.Scanner;

public class user_test {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            loop:switch (choice) {
                case 1 -> System.out.println("登录");
                case 2 -> System.out.println("注册");
                case 3 -> System.out.println("忘记密码");
                default -> {
                    System.out.println("没有这个选项请重新输入");
                    break loop;
                }
            }
        }
    }


    public static void loginUser(ArrayList<user> list) {

    }


    public static void enrollUser(ArrayList<user> list) {
        System.out.println("请输入要注册的用户名");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        int index = getIndex(list, userName);
        user u = list.get(index);
        int length = userName.length();
        if (index == -1) {
            System.out.println("您输入的用户名已存在，已返回主菜单");
        } else if (length < 3 || length > 15) {
            System.out.println("您输入的用户名不恰当请更改");
        }


    }


    public static void forgetPassage(ArrayList<user> list) {

    }


    public static int getIndex(ArrayList<user> list,String userName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

}
