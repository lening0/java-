package home;

import java.util.Scanner;

public class Student_Test {
    public static void main(String[] args) {
    loop:    while (true) {
            System.out.println("----------欢迎使用学生管理系统----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent();
                case "2" -> deleteStudent();
                case "3" -> updateStudent();
                case "4" -> findStudent();
                case "5" -> {
                    break loop;
                    //system.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }



    //添加学生
    public static void addStudent() {

    }

    //删除学生
    public static void deleteStudent() {

    }


    //修改学生
    public static void updateStudent() {

    }

    //查询学生
    public static void findStudent() {}
}
