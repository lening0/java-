package com.jnzy;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
       System.out.println(sw(8));
    }
    public static boolean sw(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
