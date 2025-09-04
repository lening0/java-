package home;

public class Cat extends Animal{


    public Cat(){

    }
    public void eat(String food){
        System.out.println(getAge()+"岁的"+getColor()+"的猫吃了点"+food);
    }
    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse(){

    }


}
