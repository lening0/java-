package com.home;

public class A {
    public static void main(String[] args) {
        String regex1 = "1[3-9]\\d{9}";

        System.out.println("14118972087".matches(regex1));

        String regex2 = "0[3-9]\\d{9}";
        String regex3 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex3));
        String regex4 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("2370159638@qq.com".matches(regex4));
        String regex5 = "\\w{4,16}";
        String regex6 = "[1,9]\\d{16}(\\d|x|X)";
    }
}
