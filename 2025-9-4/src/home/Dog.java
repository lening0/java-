package home;

public class Dog extends Animal {

    public Dog(){

    }
    public void eat(String food){
        System.out.println(getAge()+"岁的"+getColor()+"的狗抱住"+food+"猛啃");
    }
    public Dog(int age, String color) {
        super(age, color);
    }
    public void lookHome(){

    }

}
