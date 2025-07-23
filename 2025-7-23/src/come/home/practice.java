package come.home;

import java.util.Scanner;

public class practice {
//    //主入口
//    public static void main(String[] args) {
//        //byte
//        byte b = 10;
//        System.out.println(b);//10
//        //short
//        short s = 200;//200
//        System.out.println(s);
//        //int
//        int i = 10000;//10000
//        System.out.println(i);
//        //long
//        long n = -1000000L;//-100000
//        System.out.println(n);
//
//
//
//        //float
//        float f = 1.2F;//1.2
//        System.out.println(f);
//        //double
//        double d = 1.3;//1.3
//        System.out.println(d);
//
//        //char
//        char c = '炫';
//        System.out.println(c);
//
//        //boolean
//        boolean o = true;
//        System.out.println(o);
//    }


    public static void main(String[] args) {
//      String a = "李祥宁";//定义姓名
//      int b = 19;//定义年龄
//      char c = '男';//定义性别
//      double d = 170.0;//定义身高
//      boolean e = true;//定义身份
//      System.out.println(a);
//      System.out.println(b);
//      System.out.println(c);
//      System.out.println(d);
//      System.out.println(e);
//        String name = "指环王";
//        int age = 2001;
//        String name1 = "伊利亚·伍德、伊恩·麦克莱恩、丽芙·泰勒、维戈·莫特森";
//        double score = 8.8;
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(name1);
//        System.out.println(score);
//        String phone = "huawei\noppo\nvivo";
//        int price1 = 5299;
//        int price2 = 1299;
//        int price3 = 2299;
//        System.out.println(phone);
//        System.out.println(price1);
//        System.out.println(price2);
//        System.out.println(price3);
        //创建对象表示我要用Scanner
//        Scanner sc = new Scanner(System.in);
//        //提示词
//        System.out.println("请输入整数");
//        //接收数据
//        int n = sc.nextInt();
//        //打印输入
//        System.out.println(n);
        //录入两个整数
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        //求和
//        System.out.println(n1+n2);
//        System.out.println(3 + 2);//5
//        System.out.println(3 - 2);//1
//        System.out.println(3 * 2);//6
//        System.out.println(3 / 2);//1
//        System.out.println(3 % 2);//1
//        //小数参与运算可能不精确
//        System.out.println(1.10 - 1.01);
        //作用：输入三位数后拆分各位
        //输入
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int n1 = n / 100;
//        n = n % 100;
//        int n2 = n / 10;
//        n = n % 10;
//        int n3 = n % 10;
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
        //隐式转换
//        int a = 10;
//        double b = a;
//        System.out.println(a);
//        System.out.println(b);
//        byte b1 = 10;
//        byte b2 = 10;
//        int i1 = b1+b2;
//        System.out.println(i1);
//        int i = 10;
//        long n = 100L;
//        long l = n+i;
//        System.out.println(l);
        //强制转换可能会导致出现错误
//        int a = 300;
//        byte b = (byte) a;
//        System.out.println(b);
//        byte c = 10;
//        byte d = 20;
//        byte e = (byte) (c + d);//c+d为int类型
//        System.out.println(e);
        //键盘录入
//        Scanner sc = new Scanner(System.in);
//        //输入三位数
//        int n = sc.nextInt();
//        int n1 = n / 100;
//        n =  n % 100;
//        int n2 = n / 10;
//        n =  n % 10;
//        //打印输出
//        System.out.println("百位是"+ n1);
//        System.out.println("十位是"+ n2);
//        System.out.println("个位是"+ n);
//        short a = 1;
//        a += 1;
//        //short a = (short)(a + 1)
//        //除=外的赋值运算都包含强制类型转换
//        System.out.println(a);
//        //输入两个数表示我和约会对象的衣服时髦程度
//        Scanner sc = new Scanner(System.in);
//        //提示输入
//        System.out.println("请输入你与对方时髦程度0~10");
//        //定义程度
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        System.out.println(n1 > n2);
//        //逻辑运算符
//        //&并且 |或者
//        //^相同为false 不同为true，!为取反
//        //短路逻辑运算符
//        //&& ||
//        int a = 10;
//        int b = 10;
//        boolean result = ++a < 5 && ++b <5;
//        //当左边条件不符合时整体为假，右边不参与运算
//        System.out.println(result);
//        System.out.println(a);
//        System.out.println(b);
        //输入两个数
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        //当n或m为6或n+m为6的倍数时输出true否则输出false
//        System.out.println(n == 6 || m == 6 || (m + n) % 6 == 0);
        //三元表达式
//        int a = 10;
//        int b = 2;
//        //打印较大值
//        System.out.println(a < b ? 'b' : 'a');
//        Scanner sc = new Scanner(System.in);
//        //第一只老虎的体重
//        int n = sc.nextInt();
//        //第二只老虎的体重
//        int m = sc.nextInt();
//        //如果体重相同则输出yes否则输出no
//        System.out.println(m == n ? "Yes" : "No");
        //输出三个人的最高身高
        //输入三人身高
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //前两个人相比，前一个更高的人和后一个人比，输出最高的人
        System.out.println((a > b ? a : b) > c ? (a > b ? a : b) : c);


    }
}








































































































































































