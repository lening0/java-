package home;

public class StringD {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("ccc");
        sb.append(1);
        sb.append('a');
        sb.append('a');
        sb.reverse();
        int len = sb.length();
        String s = sb.toString();
        System.out.println(len);
        System.out.println(sb.toString());
        System.out.println(s);
    }
}
