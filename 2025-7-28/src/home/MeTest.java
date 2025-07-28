package home;

public class MeTest {
    public static void main(String[] args) {
        Me m = new Me();
        m.eat();
        m.age = 19;
        m.name = "li";
        m.hobby = "game";
        System.out.println(m.age);
        System.out.println(m.name);
        System.out.println(m.hobby);
    }
}
