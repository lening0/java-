package com;

import java.util.Random;
import java.util.Scanner;

public class home {
    public static void main(String[] args) {
//        //if语句判断身高是否达标
//        //先录入输入值
//        Scanner sc = new Scanner(System.in);
//        //提示语
//        System.out.println("请输入你的身高");
//        int n = sc.nextInt();
//        //判断条件
//        if(n > 175){
//            System.out.println("您可以参加训练");
//        }
        //考试通过获得蛋糕
        //定义自己的考试分数为n
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n > 100){
//            System.out.println("获得蛋糕");
//        }
//        //输入红绿灯状况判断行动
//        //定义light为红绿灯状况
//        Scanner sc = new Scanner(System.in);
//        String light = sc.nextLine();
//        //判断绿灯
//        if(light.equals("green")){
//            System.out.println("go go go");
//        }
//        //判断红灯
//        else  if(light.equals("red")){
//            System.out.println("no no no");
//        }
//        //其余为黄灯
//        else{
//            System.out.println("wait wait wait");
//        }
//        int n = 99;
//        if (n>100){
//            System.out.println("ok");
//        } else {
//            System.out.println("no");
//        }
//        //电影院选座，奇数为左偶数为右，票号为1~100
//        Scanner sc = new Scanner(System.in);
//        //定义n为票号
//        int n = sc.nextInt();
//        if (n > 0 && n < 101){
//            //判断n为偶数则打印"请坐右边"
//            if (n % 2 == 0){
//                System.out.println("请坐右边");
//            }  else {//判断n为奇数则打印"请坐右边"
//                System.out.println("请坐左边");
//            }
//        }else {
//            System.out.println("票号不正确");
//        }
        //原价格为1000元赋值为n
//        int n = 1000;
//        //输入会员等级1~3 算出折扣后多少钱
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        if (m == 1){
//            System.out.println(n * 0.9);
//        } else if (m == 2){
//            System.out.println(n * 0.8);
//        }  else if (m == 3){
//            System.out.println(n * 0.7);
//        }  else {
//            System.out.println("没会员，1000");
//        }
        //我想拿的offer公司
//        Scanner sc = new Scanner(System.in);
//        String offer = sc.nextLine();
//        switch (offer) {
//            case "腾讯":
//                System.out.println("你得冲q币");
//                break;
//            case "阿里":
//                System.out.println("你得清空购物车");
//                break;
//            case "字节":
//                System.out.println("需要每天刷12个小时抖音");
//                break;
//            case "米哈游":
//                System.out.println("你需要成为原神高手");
//            default:
//                System.out.println("进厂打螺丝");
//        }
        //可代替的简易写法
//        Scanner sc = new Scanner(System.in);
//        String offer = sc.nextLine();
//        switch (offer) {
//            case "腾讯" -> {
//                System.out.println("你得冲q币");
//            }
//            case "阿里" -> {
//                System.out.println("你得清空购物车");
//            }
//            case "字节" -> {
//                System.out.println("需要每天刷12个小时抖音");
//            }
//            case "米哈游" -> {
//                System.out.println("你需要成为原神高手");
//            }
//            default -> {
//                System.out.println("进厂打螺丝");
//            }
//        }
        //只有一行输出时可写成
//        Scanner sc = new Scanner(System.in);
//        String offer = sc.nextLine();
//        switch (offer) {
//            case "腾讯" -> System.out.println("你得冲q币");
//            case "阿里" -> System.out.println("你得清空购物车");
//            case "字节" -> System.out.println("需要每天刷12个小时抖音");
//            case "米哈游" -> System.out.println("你需要成为原神高手");
//            default -> System.out.println("进厂打螺丝");
//        }
        //打印星期几来判断是工作日还是休息日
        //输入
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //判断是否输入正确
//        if (n > 0 && n < 8) {
//            //判断是否为工作日
//            if (n > 0 && n < 6) {
//                System.out.println("工作日");
//            }else {
//                System.out.println("休息日");
//            }
//        }else {
//            System.out.println("没有这个星期");
//        }
        //case穿透写法
        //输入
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        switch (n){
//            case 1,2,3,4,5 -> System.out.println("工作日");
//            case 6,7 -> System.out.println("休息日");
//            default -> System.out.println("没有这个星期");
//        }
        //模拟电话按钮服务
        //输入
        //提示词
//        System.out.println("1机票查询\n" +
//                "2机票预约\n" +
//                "3机票改签\n" +
//                "4退出服务\n" +
//                "请选择");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //模拟选项switch
//        switch(n){
//            case 1 -> System.out.println("查询机票");
//            case 2 -> System.out.println("机票预约");
//            case 3 -> System.out.println("机票改签");
//            default -> System.out.println("退出服务");
//        }
        //1~10
        //定义i
//        int i = 0;
//        for (i = 0;i < 10; i ++){
//            System.out.println(i);
//        }
//        int i = 5;
//        for (i = 5; i > 0; i--) {
//            System.out.println(i);
//        }
//        for (int i = 1; i < 6; i ++){
//            System.out.println("第" + i + "断线重连");
//        }
//        int count = 0;
//        for (int i = 1; i <= 5; i++) {
//            count += i;
//        }
//        System.out.println(count);
        //1~100偶数和
//        int count = 0;
//        for (int i = 2; i <= 100; i+=2) {
//            count += i;
//        }
//        System.out.println(count);
        //其他方法
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                count += i;
//            }
//        }
//        System.out.println(count);
        //输入两个值代表最大值和最小值
//        Scanner sc = new Scanner(System.in);
//        int min = sc.nextInt();
//        int max = sc.nextInt();
//        //计数为count
//        int count = 0;
//        for (int i = min; i <= max; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
        //while 循环
//        int i = 1;
//        while (i <= 100) {
//            System.out.println(i);
//            i ++;
//        }
//        System.out.println(i);//101
//        double n = 0.1;
//        int count = 0;
//        while (n <= 8844430) {
//            count++;
//            n *= 2;
//        }
//        System.out.println(count);
        //回文数
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int wei = 1;
//        int i = n;
//        int n1 = 1;
//        while (i / 10 != 0) {
//            i = i / 10;
//            wei ++;
//        }
//        System.out.println(wei);
//        //wei代表输入的位数
//        for (;n1 )
        //输入为n
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //定义10
//        int i = 10;
//        int j = 1;
//        //掏出首数字
//        while (n / i != 0){
//            n /= i;
//        }
//        //掏出末尾数字
//
//        System.out.println(n);
        //正式自己步骤
        //首先定义i为自测数字
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        //用n来替代i做测试保留i的原数做对比
//        int n = i;
//        //设count为反数
//        int count = 0;
//        //不断将末尾数拿出再*10再加下一个数从而达到反转目的
//        while (n / 10 != 0) {
//            count = count * 10 +n % 10;
//            n /= 10;
//        }
//        //第一位由于不能被10除所以单独加
//        count = count *10 + n;
//        //判断是否是回文数
//        if (count == i) {
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//        System.out.println(count);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int temp = x;
//        int num = 0;
//        while (x != 0) {
//            int ge = x % 10;
//            x /= 10;
//            num =  num * 10 + ge;
//        }
//        if (num == temp) {
//            System.out.println("yes");
//        }
        //求商和余数(不使用/和%的前提)
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int count = 0;
//        while (n > m){
//            n -= m;
//            count ++;
//        }
//        System.out.println(count);
//        System.out.println(n);
        //跳过循环
//        int i = 1;
//        for (; i <=5; i ++){
//            if (i == 3){
//                continue;
//            }
//            System.out.println("今天是第"+i+"天");
//        }
        //跳出循环
//        int i = 1;
//        for (; i <=5; i ++){
//            if (i == 3){
//                break;
//            }
//            System.out.println("今天是第"+i+"天");
//        }
        //逢7过
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        int n = i;
//        while (true){
//            if (n % 7 == 0){
//                System.out.println("过");
//                break;
//            }
//            while (n != 0){
//                if (n %10 == 7){
//                    System.out.println("过");
//                    break;
//                }
//                n = n / 10;
//            }
//            System.out.println(i);
//            break;
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 ==7) {
//                System.out.println("过");
//            }else {
//                System.out.println(i);
//            }
//        }
        //求输入值的平方根(取整）
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个大于2的整数");
//        //输入值赋值为n
//        int n = sc.nextInt();
//        int i = 1;
//        //最后i会超过1个单位，后续手动减去
//        for (; i * i <= n; i++) {
//
//        }
//        System.out.println(i-1);
        //判断是否为质数
        //输入
//        Scanner sc = new Scanner(System.in);
//        int i = sc. nextInt();
//        int count = 0;
//        for (int j = 1; j <= i; j++) {
//            if (i % j == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println("是质数");
//        }else {
//            System.out.println("不是质数");
//        }
        //猜数字1~100
        Random rand = new Random();
        int i = rand.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (i == n){
                System.out.println("猜对了答案是" + i);
                break;
            }else if (i < n){
                System.out.println("猜大了");
            }
            else {
                System.out.println("猜小了");
            }
        }













    }
}






















































































































































