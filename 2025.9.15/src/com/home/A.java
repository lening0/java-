package com.home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
    public static void main(String[] args) {
        /*需求:把下面文木中的座机电话，邮箱，手机号，热线都爬取出来。
来黑马程序员学习Java,手机号:18512516758，18512508907
或者联系邮箱:boniu@itcast.cn，
座机电话:01036517895，010-98951256
邮箱:bozai@itcast.cn
热线电话:400-618-9090，400-618-4000，4006184000，4006189090
手机号的正则表达式:1[3-9]\d(9)
邮箱的正则表达式:\w+@[\w&&[^]]{2,6}(\.[a-zA-Z]{2,3}){1,2)
座机电话的正则表达式:0\d{2,3)-?[1-9]\d(4,9)
         */
        String str = "来黑马程序员学习Java," +
                "手机号:18512516758，18512508907" +
                "或者联系邮箱:boniu@itcast.cn," +
                "座机电话:01036517895，010-98951256" +
                "邮箱:bozai@itcast.cn" +
                "热线电话:400-618-9090，400-618-4000，4006184000，4006189090";
        //System.out.println(str);
        Pattern numberPattern = Pattern.compile("1[3-9]\\d{9}");
        Pattern emailPattern = Pattern.compile("\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}");
        Pattern zuoPattern = Pattern.compile("0\\d{2,3}-?[1-9]\\d{4,9}");
        Pattern rePattern = Pattern.compile("400-?[1-9]\\d{2}-?[1-9]\\d{3}");
        Pattern allPattern = Pattern.compile("(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})|(0\\d{2,3}-?[1-9]\\d{4,9})|(400-?[1-9]\\d{2}-?[1-9]\\d{3})");
        Matcher matcher = allPattern.matcher(str);
        Matcher numberMatcher = numberPattern.matcher(str);
        Matcher emailMatcher = emailPattern.matcher(str);
        Matcher zuoMatcher = zuoPattern.matcher(str);
        while (matcher.find()) {
//            System.out.println("手机号为"+numberMatcher.group());
//            System.out.println("邮箱号为"+emailMatcher.group());
//            System.out.println("座机号为"+zuoMatcher.group());
            System.out.println(matcher.group());
        }



    }
}
