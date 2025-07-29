package home;

public class meTest {
    public static void main(String[] args) {
        me m =  new me();
        me n = new me(18,"lxn");
        System.out.println(n.getAge());
        System.out.println(n.getName());
    }
}
