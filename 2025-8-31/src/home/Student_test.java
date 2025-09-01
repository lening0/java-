package home;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_test {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<student>();
        loop :while (true) {
            System.out.println("----------欢迎使用------------");
            System.out.println("----------按1增加学生---------");
            System.out.println("----------按2删除学生---------");
            System.out.println("----------按3修改学生---------");
            System.out.println("----------按4查询学生---------");
            System.out.println("----------按5退出程序---------");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> findStudent(list);
                case "5" -> {
                    break loop;
                }
            }
        }
    }


    public static void addStudent(ArrayList<student> list) {
        student stu = new student();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生id");
            id = sc.next();
            if (onlyStudent(list,id)) {
                break;
            }
            System.out.println("您输入的id已存在");
        }
        stu.setId(id);
        System.out.println("请输入学生姓名");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("请输入学生地址");
        String address = sc.next();
        stu.setAddress(address);
        list.add(stu);
    }

    public static void deleteStudent(ArrayList<student> list) {
        System.out.println("请输入要删除的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if (getIndex(list,id) >= 0) {
            list.remove(getIndex(list,id));
            return;
        }
        System.out.println("您输入的id不存在，已返回菜单");
    }

    public static void updateStudent(ArrayList<student> list) {
        System.out.println("请输入要修改的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list,id);
        if (index >= 0) {
            System.out.println("请输入修改后的name");
            String name = sc.next();
            student stu = list.get(index);
            stu.setName(name);
            System.out.println("请输入修改后的年龄");
            int age = sc.nextInt();
            stu.setAge(age);
            System.out.println("请输入修改后的地址");
            String address = sc.next();
            stu.setAddress(address);
            System.out.println("修改成功");
            return;
        }
        System.out.println("id不存在已返回菜单");
    }

    public static void findStudent(ArrayList<student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t\t"+"name\t"+"age\t"+"address");
        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }
    }

    public static boolean onlyStudent(ArrayList<student> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public static int getIndex(ArrayList<student> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
