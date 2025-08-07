package home;

public class StringA {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "abcde";
        System.out.println(O(a,b));
//        System.out.println(a.substring(1));
    }
    public static boolean O(String a,String b){
        String New;
        for(int j=0;j<b.length();j++){
            char f = a.charAt(0);
            New = a.substring(1);
            a = new StringBuilder(New).append(f).toString();
            if(a.equals(b)){
                return true;
            }
        }
        return false;
    }
}
