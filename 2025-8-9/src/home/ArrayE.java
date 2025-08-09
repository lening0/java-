package home;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayE {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Student s = new Student();
            System.out.println("输入姓名");
            String name = sc.next();
            System.out.println("输入年龄");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+list.get(i).getAge());
        }
    }
}
