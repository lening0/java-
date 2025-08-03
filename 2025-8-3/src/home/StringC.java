package home;

public class StringC {
    public static void main(String[] args) {
        String str = "我cnm，你个臭sb";
        String [] arr = {"c","m","b","s"};
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i],"*");
        }
        System.out.println(str);
    }
}
