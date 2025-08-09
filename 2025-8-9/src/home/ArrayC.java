package home;

import java.util.ArrayList;

public class ArrayC {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
                break;
            }
            System.out.print(list.get(i)+",");
        }
        System.out.println("]");
    }
}
