package home;

public class test {
    private int age;
    private  String name;

    public test() {
    }

    public test(int age, String name) {
        this.age = age;
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

    public String toString() {
        return "test{age = " + age + ", name = " + name + "}";
    }

//    public test() {
//    }
//
//    public test(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

}
