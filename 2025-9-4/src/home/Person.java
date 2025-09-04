package home;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal animal,String food){
        if (animal instanceof Dog d){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getAge()+"岁的"+d.getColor()+"狗");
            d.eat(food);
        } else  if(animal instanceof Cat c){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+animal.getAge()+"岁的"+c.getColor()+"猫");
            c.eat(food);
        } else {
            System.out.println("没有这个动物");
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
