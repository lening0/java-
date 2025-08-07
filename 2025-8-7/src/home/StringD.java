package home;

public class StringD {
    public static void main(String[] args) {
        String a = "12345";
        String b = "23";
        System.out.println(rom(b)*rom(a));
    }
    public static int rom (String str){
        int num = 0;
        char[] arr = str.toCharArray();
        char [] arr1 = new char[10];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = (char)(48+i);
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] == arr1[j]) {
                    num = (num+j)*10;
                    break;
                }
            }
        }
        return num/10;
    }
}
