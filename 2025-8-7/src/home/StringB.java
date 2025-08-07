package home;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Random;
import java.util.Scanner;

public class StringB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char [] b = a.toCharArray();
        //交换char内字符
        Random c = new Random(b.length);
        for (int i = 0; i < b.length; i++) {
            int p = c.nextInt(b.length);
            char temp = b[i];
            b[i] = b[p];
            b[p] = temp;
        }
        System.out.println(new String(b));
    }
}
