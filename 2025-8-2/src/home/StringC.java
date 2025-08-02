package home;

public class StringC {
    public static void main(String[] args) {
        String str = "abcAS6";
        int Bigcount = 0;
        int Smallcount = 0;
        int Numbercount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                Smallcount ++;
            }else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                Bigcount ++;
            }else {
                Numbercount ++;
            }
        }
        System.out.println(Bigcount);
        System.out.println(Smallcount);
        System.out.println(Numbercount);
    }
}
