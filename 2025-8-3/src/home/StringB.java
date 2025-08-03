package home;

import java.util.Scanner;

public class StringB {
    public static void main(String[] args) {
        System.out.println("请输入你的身份证号码");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String year = str.substring(6,10);
        String month = str.substring(10,12);
        String day = str.substring(12,14);
        System.out.println("人物信息为：");
        System.out.print(year+"年"+month+"月"+day+"日出生");
        if (str.charAt(16) % 2 ==0){
            System.out.println("性别为：女");
        }else{
            System.out.println("性别为：男");
        }
    }
}
