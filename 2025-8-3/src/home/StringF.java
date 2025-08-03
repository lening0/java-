package home;

import java.util.Arrays;

public class StringF {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(SP(arr));
    }
    public static String SP(int [] arr){
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]+"]");
                break;
            }
            sb.append(arr[i]+",");
        }
        return sb.toString();
    }
}
