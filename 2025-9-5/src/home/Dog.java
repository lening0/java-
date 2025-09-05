package home;

public class Dog extends Animal  implements Swim {
    @Override
    public void eat() {
        System.out.println("吃史");
    }
    public Dog() {}
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
