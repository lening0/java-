package home;

import java.util.ArrayList;
import java.util.List;

public class ArrayG {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("apple",8000);
        Phone p2 = new Phone("huawei",7000);
        Phone p3 = new Phone("xiaomi",2000);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (int i = 0; i < Return(list).size(); i++) {
            System.out.println(Return(list).get(i).getName()+Return(list).get(i).getPrice());
        }
    }
    public static ArrayList<Phone> Return(List<Phone> list){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<3000){
                result.add(list.get(i));
            }
        }
        return result;
    }
}
