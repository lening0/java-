package home;

import java.util.Scanner;

public class StringE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Reverse(s);
    }

    public static void Reverse(String str){
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--){
            s += str.charAt(i);
        }
        System.out.println(s);
    }
}
