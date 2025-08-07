package home;

import java.util.Random;

public class StringC {
    public static void main(String[] args) {
        char [] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25){
                arr[i] = (char)(i+ 97);
            }
            else{
                arr[i] = (char)(i+65-26);
            }
        }
        char [] arr2 = new char[5];
        Random r = new Random();
        for (int i = 0; i < arr2.length-1; i++) {
            int o = r.nextInt(arr.length);
            arr2[i] =  arr[o] ;
        }
        arr2[arr2.length-1] = (char) r.nextInt(48,58);
        int o = r.nextInt(arr2.length);
        char temp = arr2[arr2.length-1];
        arr2[arr2.length-1] = arr2[o];
        arr2[o] = temp;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++) {
            sb.append(arr2[i]);
        }
        System.out.println(sb.toString());

    }
}
