package home;

import java.util.ArrayList;
import java.util.List;

public class ArrayF {
    public static void main(String[] args) {
        ArrayList <User> list =  new ArrayList<User>();
        User u2 = new User("张三",110,"123456");
        User u1 = new User("李四",122,"654321");
        list.add(u1);
        list.add(u2);
        System.out.println(find(110,list));
    }
    public static int find(int id, List<User> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            };
        }
        return -1;
    }
}
