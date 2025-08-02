package home;

import java.util.Random;
import java.util.Scanner;

public class StringF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入");
            int n = sc.nextInt();
            if(n >= 0 && n <= 9999999){
                String s = Rmv(n);
                while (s.length() != 7){
                    s = "零" + s;
                }
                String unit = Unit();
                String o = "";
                for (int i = 0; i < s.length(); i++) {
                    o += s.charAt(i);
                    o += unit.charAt(i);
                }
                System.out.println(o);
            }else {
                System.out.println("请重新输入");
            }
        }
    }

    public static String Rmv(int n){
        String  [] str = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String s = "";
        while(n != 0){
            int m = n % 10;
            s = str[m] + s;
            n /= 10;
        }
        return s;
    }
    public static String Unit(){
        String s = "佰拾万仟佰拾元";
        return s;
    }
}
