package home;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class User_test {
    public static void main(String[] args) {
        //设置学生管理系统的存储列表list
        ArrayList<User> list = new ArrayList<>();
        //循环菜单界面
        while (true) {
            //打印菜单界面
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码");
            //输入设为choice
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            //分析choice
            loop:switch (choice) {
                case 1 -> loginUser(list);
                case 2 -> enrollUser(list);
                case 3 -> forgetPassage(list);
                default -> {
                    System.out.println("没有这个选项请重新输入");
                    break loop;
                }
            }
        }
    }


    public static void loginUser(ArrayList<User> list) {
        //可以有三次机会
        for (int i = 0; i < 3; i++) {
            //输入用户名为username
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            //判断用户名是否存在，若不存在则直接返回
            //遍历list寻找有没有相同的用户名
            int inDex = getIndex(list, username);
            if(inDex == -1) {
                System.out.println("输入用户不存在，请先注册");
                return;
            }
            User u = list.get(inDex);
//            for (int j = 0; j < list.size(); j++) {
//                user u = list.get(j);
//                if (u.getUserName().equals(username)) {
//                    //有相同的则直接提示然后返回
//                    System.out.println("输入用户不存在，请先注册");
//                    return;
//                }
//            }
            //到此已经确认有相同的用户名
            //创建验证码
//            Random random = new Random();
//
//            //将大小写字母塞到letters上
//            char [] letters = new char[52];
//            for (int j = 0; j < letters.length; j++) {
//                if(j<26){
//                    letters[j] = (char) ('a'+j);
//                } else{
//                    letters[j] = (char) ('A'+(j-26));
//                }
//            }
//            random =  new Random();
//            //num为随机数字，rand为随机索引
//            char num = (char)(random.nextInt(10)+49);
//            //创建一个新的储存验证码的数组,设为letter
//            char letter = letters[5];
//            //第几个插入数字
//            random =  new Random();
//            int number = random.nextInt(5);
//            for (int j = 0; j < 5; j++) {
//                if(j == number){
//                    letters[j] = num;
//                    continue;
//                }
//                int rand =  random.nextInt(letters.length);
//                letters[j] = letters[rand];
//            }
//            System.out.println("请输入验证码");
//            System.out.println("验证码为"+letter);
//            Scanner sc1 = new Scanner(System.in);
//            String myLetter = sc1.nextLine();
//            while (true) {
//                if(myLetter.equals(letter)){
//                    break;
//                } else {
//                    System.out.println("请重新输入");
//                }
//            }

            String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            char [] code = new char[5];
            while (true) {
                for (int j = 0; j < 5; j++) {
                    Random random = new Random();
                    int index = random.nextInt(letters.length());
                    code [j] = letters.charAt(index);
                }
                Random random = new Random();
                int num = random.nextInt(48,58);
                char num1 = (char)num;
                int sui = random.nextInt(5);
                code[sui] = num1;
                String letter = new String(code);
                System.out.println("验证码为" + letter);
                System.out.println("请输入验证码");
                String myLetter = sc.next();
                if (letter.equals(myLetter)) {
                    break;
                } else{
                    System.out.println("请重新输入验证码");
                }
            }

            for (int j = 0; j < 3; j++) {
                System.out.println("请输入密码");
                Scanner sc2 = new Scanner(System.in);
                String password = sc2.nextLine();
                if(password.equals(u.getPassword())){
                    System.out.println("成功");
                    return;
                }
                if(j==2){
                    System.out.println("输入错误过多已返回主菜单");
                    return;
                }
                System.out.println("密码错误请重试，还有"+(2-j)+"次机会");
            }
        }
    }


    public static void enrollUser(ArrayList<User> list) {
        //注册一个新的用户
        User u = new User();
        System.out.println("请输入要注册的用户名");
        Scanner sc = new Scanner(System.in);
        //输入用户名
        String userName = sc.next();
        //判断输入是否唯一，并带回存在的索引index，不存在为-1
        int index = getIndex(list, userName);
        //将输入的用户名数量设为length
        int length = userName.length();
        //bl为判断用户名是否为数字＋字母组合，如果是则返回true不是则返回false
        boolean bl = true;
        //遍历输入的用户名单个值判断是否全为数字+字母的形式
        for (int i = 0; i < length; i++) {
            if (userName.charAt(i) >= 48 && userName.charAt(i) <= 57 || userName.charAt(i) >= 65 && userName.charAt(i) <= 90 || userName.charAt(i) >= 97) {
                //判断为全为数字+字母
                bl = false;
            } else  {
                //判断含有其他值
                bl = true;
            }
        }
        boolean bl1 = false;
        //bl1是判断输入用户名是否为全数字
        int count = 0;
        //count代表输入的用户名有多少个数字
        for (int i = 0; i < length; i++) {
            if (userName.charAt(i) >= 48 && userName.charAt(i) <= 57) {
                count ++;
            }
        }
        //判断用户名数字个数是否和总用户名单个数相同，相同则返回true
        if (count == length) {
            bl1 = true;
        }
        //index为-1，则输入的用户名不存在,>=0则说明用户名已存在且index为索引
        if (index >= 0) {
            System.out.println("您输入的用户名已存在，已返回主菜单");
            return;
        } else if (length < 3 || length > 15) {
            //判断输入用户名是否规范
            System.out.println("您输入的用户名数量请更改");
            return;
        } else if (bl){
            //判断返回true则说明输入的用户名含有其他值
            System.out.println("您输入的用户名只能为大小写和数字组合");
            return;
        } else if(bl1){
            //判断是否全为数字
            System.out.println("您输入的用户名全为数字，请重新输入");
            return;
        }
        System.out.println("请输入设置的密码");
        Scanner sc1 = new Scanner(System.in);
        String psd1 = sc.next();
        System.out.println("请重新输入密码");
        Scanner sc2 = new Scanner(System.in);
        String psd2 = sc2.next();
        //判断ps1和psd2是否完全相同
        if (psd1.equals(psd2)) {
            System.out.println("密码输入正确");
        } else{
            System.out.println("您输入的两次密码并不完全相同");
            return;
        }
        //输入身份证，输入设为idCard1
        System.out.println("请输入身份证号码");
        Scanner idCard  = new Scanner(System.in);
        String idCard1 = idCard.next();
        //length1为输入的身份证数量
        int length1 = idCard1.length();
        //设置布尔bl2,判断身份证是否正确
        boolean bl2 = false;
        //遍历输入的身份证判断开头是否为0，且前17位是否为数字
        loop :for (int i = 0; i < length1; i++) {
            if (idCard1.charAt(i) <= 48 && idCard1.charAt(i) >= 57) {
                if (i == 17 && idCard1.charAt(i) == 88|| idCard1.charAt(i) == 120) {
                    bl2 = false;
                    break loop;
                }
                bl2 = true;
            } else if(idCard1.charAt(0) == 0) {
                bl2 = true;
            }
        }
        if(length1 != 18){
            System.out.println("您输入的身份证号码长度不符合规范");
            return;
        }else if(bl2){
            System.out.println("您输入的身份证号码不正确");
            return;
        }
        //手机号输入，设值为phoneNumber1
        System.out.println("请输入您的手机号");
        Scanner phoneNumber = new Scanner(System.in);
        String phoneNumber1 = phoneNumber.next();
        //将输入的手机号长度设为length2
        int length2 = phoneNumber1.length();
        //判断
        //设bl3判断
        boolean bl3 = false;
        for (int i = 0; i < length2; i++) {
            //手机号是否为数字，且第一位不为0
            if (phoneNumber1.charAt(i) < '0' || phoneNumber1.charAt(i) > '9') {
                bl3 = true;
            }  else if(phoneNumber1.charAt(0) == '0') {
                bl3 = true;
            }
        }
        if(length2 != 11){
            System.out.println("输入号码个数不正确");
            return;
        }else if(bl3){
            System.out.println("输入的首号码为0或输入的号码有非数字");
            return;
        }

        //全部正确后依次输入
        //用户名设置为输入的用户名
        u.setUserName(userName);
        u.setPassword(psd1);
        u.setIdCard(idCard1);
        u.setPhoneNumber(phoneNumber1);
        list.add(u);
        System.out.println("您已经注册成功，即将返回主页面");
    }


    public static void forgetPassage(ArrayList<User> list) {
        System.out.println("请输入要修改的用户名");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        //判断输入的用户名是否存在，如果存在返回索引，不存在返回-1
        int index = getIndex(list,userName);
        if(index == -1) {
            System.out.println("您输入的用户名不存在");
            return;
        }
        System.out.println("请输入你的身份证号");
        String idCard = sc.next();
        User u = list.get(index);
        if (idCard.equals(u.getIdCard())) {
            System.out.println("请输入手机号码");
            String phoneNumber = sc.next();
            if(phoneNumber.equals(u.getPhoneNumber())){
                System.out.println("请输入要修改的密码");
                String password = sc.next();
                u.setPassword(password);
                System.out.println("修改密码完成");
            }else{
                System.out.println("输入的手机号不正确");
                return;
            }

        }else {
            System.out.println("输入的身份号不正确");
            return;
        }



    }


    public static int getIndex(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

}
