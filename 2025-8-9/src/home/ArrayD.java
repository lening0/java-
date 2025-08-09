package home;

import java.util.ArrayList;

public class ArrayD {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("lxn",18);
        Student s2 = new Student("ppp",19);
        list.add(s1);
        list.add(s2);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getName()+list.get(i).getAge());
        }
    }
}
