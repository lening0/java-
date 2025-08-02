package home;

public class StringD {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Str(arr));
    }

    public static String Str(int[] arr) {
        String s = "[";
        if (arr == null){
            return "";
        }
        if (arr.length == 0){
            return "[]";
        }
        for (int i = 0; i < arr.length; i++) {
            s += arr [i];
            if (i != arr.length - 1){
                s += ",";
            }
        }
        return s+"]";
    }
}
