package home;

public class ArrayUtil {
    //私有化构造方法
    private ArrayUtil() {}


    //返回字符串取名为printArr
    public static String printArr(int arr []){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr.length){
                sb.append(arr[i]);
            }
            else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }



    public static int getAverage (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}














