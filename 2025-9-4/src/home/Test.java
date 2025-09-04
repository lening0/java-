package home;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("老王",30);
        Person person2 = new Person("小李",20);

        Animal dog = new Dog(2,"黑色");
        Animal cat = new Cat(3,"白色");

        person1.keepPet(dog,"史");
        person2.keepPet(cat,"🐟");
    }
}
