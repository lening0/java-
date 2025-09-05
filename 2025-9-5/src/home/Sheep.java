package home;

public class Sheep extends Animal{
    @Deprecated
    public void eat() {
        System.out.println("吃愺");
    }

    public Sheep() {}
    public Sheep(String name, int age) {
        super(name, age);
    }
}
