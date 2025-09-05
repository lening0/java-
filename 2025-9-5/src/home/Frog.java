package home;

public class Frog extends Animal implements Swim {
    @Override
    public void eat() {
        System.out.println("吃虫子，喝水");
    }
    public Frog(){}
    public Frog(String name, int age) {
        super(name, age);
    }
    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
