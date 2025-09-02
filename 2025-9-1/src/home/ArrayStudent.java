package home;

import java.util.ArrayList;

public class ArrayStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(3);
        Student s1 = new Student("lxn",18,1);
        Student s2 = new Student("ply",19,2);
        Student s3 = new Student("apl",12,3);
        Student s4 = new Student("ppp",19,2);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(GetBest.getBest(list));
    }
}
